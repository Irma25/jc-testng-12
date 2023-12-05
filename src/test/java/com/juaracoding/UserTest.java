package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserTest {

    User user;

    @BeforeMethod
    public void setUp(){
        user = new User();
    }

//    @Test(enabled = false)
    @Test(priority = 1)
    public void testCheckLogin(){
        User user = new User();
        user.setUsername("irma");
        user.setPassword("101010");

        Assert.assertTrue(user.checkLogin());
    }

    // contains pada assertTrue
    // cpntains adalah membandingkan value dari string tidak harus semuanya di tulis

    @Test
    public void testErrorMessage(){
        // jika menulis error message kalimatnya terlalu panjang bisa menggunakan contains
        // dan untuk mendeskripsikan pesan error bisa tulis invalid saja
        boolean result = user.getErrorMessage().contains("Invalid");
        Assert.assertTrue(result);
//        Assert.assertTrue(user.getErrorMessage().contains("Invalid"));
    }

}
