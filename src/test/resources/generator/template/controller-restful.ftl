package ${basePackage}.largescreen;

import ${basePackage}.core.Result;
import ${basePackage}.core.ResultGenerator;
import ${basePackage}.model.${modelNameUpperCamel};
import ${basePackage}.service.${modelNameUpperCamel}Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import com.company.project.configurer.DomainedResource;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;
import javax.servlet.http.HttpServletRequest;
import javax.annotation.Resource;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
* Created by ${author} on ${date}.
*/
@RestController
@RequestMapping("${baseRequestMapping}")
public class ${modelNameUpperCamel}Controller extends DomainedResource{
     @Resource
     private ${modelNameUpperCamel}Service ${modelNameLowerCamel}Service;

     @PostMapping("/add")
     public Result add(${modelNameUpperCamel} ${modelNameLowerCamel}) {
        ${modelNameLowerCamel}Service.save(${modelNameLowerCamel});
        return ResultGenerator.genSuccessResult();
     }

     @DeleteMapping("/{unid}")
     public Result delete(@PathVariable String unid) {
     <#--${modelNameLowerCamel}Service.deleteById(unid);-->
        ${modelNameUpperCamel} ${modelNameLowerCamel} = ${modelNameLowerCamel}Service.findById(unid);
        ${modelNameLowerCamel}.setFlagDel(true);
        ${modelNameLowerCamel}Service.update(${modelNameLowerCamel});
        return ResultGenerator.genSuccessResult(${modelNameLowerCamel});
     }

     @PutMapping("/update")
     public Result update(${modelNameUpperCamel} ${modelNameLowerCamel}) {
        ${modelNameLowerCamel}Service.update(${modelNameLowerCamel});
        return ResultGenerator.genSuccessResult();
     }

     @GetMapping("/{unid}")
     public Result detail(@PathVariable String unid) {
        ${modelNameUpperCamel} ${modelNameLowerCamel} = ${modelNameLowerCamel}Service.findById(unid);
        return ResultGenerator.genSuccessResult(${modelNameLowerCamel});
     }

     @GetMapping("/list")
     public Result list(HttpServletRequest request,@RequestParam(required = false) String domainUnid,@RequestParam(defaultValue = "0") Integer page, @RequestParam
        (defaultValue = "20") Integer size) {
     <#--PageHelper.startPage(page, size);-->
     <#--List<${modelNameUpperCamel}> list = ${modelNameLowerCamel}Service.findAll();-->
     <#--PageInfo pageInfo = new PageInfo(list);-->
     <#--return ResultGenerator.genSuccessResult(pageInfo);-->
        String temp = this.tokenValue(request,domainUnid);
         PageHelper.startPage(page, size);
         List<${modelNameUpperCamel}> list = null;
         Condition condition = new Condition(${modelNameUpperCamel}.class);
         Example.Criteria cr= condition.createCriteria();
         <#--cr.andCondition(temp);-->
         list = ${modelNameLowerCamel}Service.findByCondition(condition);
         PageInfo pageInfo = new PageInfo(list);
         return ResultGenerator.genSuccessResult(pageInfo);

     }
}
