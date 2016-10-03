package security;///////////////////////////////////////////////////////////////////////////////
//
//Author: Jiri Fryc
//
//Licence: AGPL v3
//
//This file is part of template-api-rest-java-playframework, which is part of Prosecutor. 
///////////////////////////////////////////////////////////////////////////////


import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Base64;

public class SecurityBackend {

    public static String generateToken(String... inputData)
    {
        SecureRandom  random=new SecureRandom();
        String data=new BigInteger(130, random).toString(32);
        for(String s:inputData)
            data+=s;
        byte [] tokenByte = Base64.getEncoder().encode(data.getBytes());
        return new String(tokenByte);
    }
    public static String generateSecretKey()
    {
        SecureRandom random = new SecureRandom();
        return new BigInteger(130, random).toString(32);
    }
}
