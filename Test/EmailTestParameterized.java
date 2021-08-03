package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;


@RunWith(org.junit.runners.Parameterized.class)
public class EmailTestParameterized{
    UserRegistration user = new UserRegistration();
    private String emailTest;
    private boolean expected;

    public EmailTestParameterized(String emailTest, boolean expected){
        super();
        this.emailTest = emailTest;
        this.expected = expected;
    }

    @org.junit.runners.Parameterized.Parameters
    public static Collection<Object> input() {

        return Arrays.asList(new Object[][]{{"abc@yahoo.com", true},
                {"abc-10@yahoo.com", true},
                {"abc.1010@yahoo.com", true},
                {"abc222@abc.com", true},
                {"abc.100@abc.com", true},
                {"abc@1.com", true},
                {"abc123@gamil.a", true},
                {"abc123@yahoo.com", true},
                {"abc@gmail.com", true},
                {"abc404@gamil.com", true},
                {"abc-100@abc.net", true}});
    }

    @Test
    public  void givenEmailsAspertheParameters(){
        boolean check = user.emailUniversal(emailTest);
        Assert.assertEquals(expected, check);
    }


}
