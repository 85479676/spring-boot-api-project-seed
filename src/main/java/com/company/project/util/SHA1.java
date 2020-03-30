package com.company.project.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class SHA1 {
    private static final char HEX_DIGIT[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

    private static MessageDigest DIGEST;


    private static synchronized void init()
    {
        try
        {
            if (DIGEST == null)
                DIGEST = MessageDigest.getInstance( "SHA1" );
        }
        catch (NoSuchAlgorithmException e)
        {
            throw new RuntimeException( "Required hash function SHA-1 not available.", e );
        }
    }


    public static String getHash(String input)
    {
        init();
        DIGEST.reset();
        DIGEST.update( input.getBytes() );
        return toHexString( DIGEST.digest() );
    }


    public static String getHashBase64(String input)
    {
        init();
        DIGEST.reset();
        DIGEST.update( input.getBytes() );
        return Base64.getEncoder().encodeToString( DIGEST.digest() );
    }


    public static String toHexString(byte[] data)
    {
        if (data == null)
        {
            return null;
        }
        StringBuilder r = new StringBuilder( data.length * 2 );
        for ( byte b : data )
        {
            r.append( HEX_DIGIT[(b >> 4) & 0xF] );
            r.append( HEX_DIGIT[(b & 0xF)] );
        }
        return r.toString();
    }
}
