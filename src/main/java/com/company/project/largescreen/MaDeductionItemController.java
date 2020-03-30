package com.company.project.largescreen;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.MaDeductionItem;
import com.company.project.model.MaDeductionItems;
import com.company.project.service.MaDeductionItemService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/03/17.
 */
@RestController
@RequestMapping("/madeductionitem")
public class MaDeductionItemController extends DomainedResource {
    @Resource
    private MaDeductionItemService maDeductionItemService;

    @PostMapping("/add")
    public Result add(MaDeductionItem maDeductionItem) {
        maDeductionItemService.save(maDeductionItem);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        MaDeductionItem maDeductionItem = maDeductionItemService.findById(unid);
//        maDeductionItem.setFlagDel(true);
        maDeductionItemService.update(maDeductionItem);
        return ResultGenerator.genSuccessResult(maDeductionItem);
    }

    @PutMapping("/update")
    public Result update(MaDeductionItem maDeductionItem) {
        maDeductionItemService.update(maDeductionItem);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        MaDeductionItem maDeductionItem = maDeductionItemService.findById(unid);
        return ResultGenerator.genSuccessResult(maDeductionItem);
    }

//    @GetMapping("/list")
//    public Result list(HttpServletRequest request, @RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam
//            (defaultValue = "20") Integer size, @RequestParam(required = false) Double total, @RequestParam(required = false) Double markValue) {
//        String temp = this.tokenValue(request, domainUnid);
//        PageHelper.startPage(page, size);
//        List<MaDeductionItem> list = maDeductionItemService.findAll();
//        Condition condition = new Condition(MaDeductionItem.class);
//        Example.Criteria cr = condition.createCriteria();
////        list = maDeductionItemService.findByCondition(condition);
//        for (MaDeductionItem item : list
//        ) {
//            total = 100.0;
//            markValue = 0.0;
//            markValue += item.getMarkValue();
////            markValue++;
//            Double totals = total - markValue;
//            item.setTotal(totals);
//        }
//        PageInfo pageInfo = new PageInfo(list);
//        return ResultGenerator.genSuccessResult(pageInfo);
//
//    }


    @GetMapping("/list")
    public Result listGetmark(HttpServletRequest request, @RequestParam(required = false) String domainUnid, @RequestParam(required = false) Double total, @RequestParam(required = false) Double markValue) {
        String temp = this.tokenValue(request, domainUnid);
        List<MaDeductionItems> list = maDeductionItemService.getMark(domainUnid);
        boolean isError = false;
        for (MaDeductionItems item : list
        ) {
            if (item == null) {
                isError = true;
            } else {
                total = 100.0;
                markValue = 0.0;
                markValue += item.getMarkValue();
//            markValue++;
                Double totals = total - markValue;
                item.setTotal(totals);
            }
        }
        if (isError
        ) {
            list.clear();
            MaDeductionItems item = new MaDeductionItems();
            item.setLevel(0);
            item.setMarkValue(0.0);
            item.setTotal(100.0);
            list.add(item);
        }
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }
}
