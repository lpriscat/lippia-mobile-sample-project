package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginHomeConstants;
import org.testng.Assert;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class LoginService {

    public static void doLogin(String email, String password){
        MobileActionManager.setInput(LoginHomeConstants.MAIL_INPUT_LOCATOR, email);
        MobileActionManager.setInput(LoginHomeConstants.PASSWORD_INPUT_LOCATOR, password);
        MobileActionManager.click(LoginHomeConstants.LOGIN_BUTTON_LOCATOR);
    }

    public static void isHomepageViewLoaded(){
        MobileActionManager.waitVisibility(LoginHomeConstants.TIME_ENTRIES_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(LoginHomeConstants.TIME_ENTRIES_LOCATOR), LoginHomeConstants.PROJECTS_DISPLAYED_MESSAGE);
    }

    public static void isViewLoaded() {
        MobileActionManager.waitVisibility(LoginHomeConstants.LOGIN_PAGE_CHECKER);
        Assert.assertTrue(MobileActionManager.isVisible(LoginHomeConstants.LOGIN_BUTTON_LOCATOR), LoginHomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }


}
