package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeProjectConstants;
import com.crowdar.examples.constants.LoginHomeConstants;
import org.testng.Assert;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class HomeProjectService {

    public static void isViewLoaded() {
        MobileActionManager.waitVisibility(LoginHomeConstants.TIME_ENTRIES_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(LoginHomeConstants.TIME_ENTRIES_LOCATOR), HomeProjectConstants.HAMBURGER_BUTTON_LOCATOR);
    }
    public static void userTapsHamburger() {
        MobileActionManager.waitVisibility(HomeProjectConstants.HAMBURGER_BUTTON_LOCATOR);
        MobileActionManager.click(HomeProjectConstants.HAMBURGER_BUTTON_LOCATOR);
        MobileActionManager.waitVisibility(HomeProjectConstants.SETTINGS_BUTTON_LOCATOR);
    }
    public static void userTapsSettings (){
        MobileActionManager.click(HomeProjectConstants.SETTINGS_BUTTON_LOCATOR);
        MobileActionManager.waitVisibility(HomeProjectConstants.SETTINGS_LABEL_LOCATOR);
    }

    public static void userEnablesDarkMode() {
        MobileActionManager.click(HomeProjectConstants.DARKMODE_BUTTON_LOCATOR);
    }

    public static void checkStatusChange() {
        MobileActionManager.getAttribute(HomeProjectConstants.DARKMODE_BUTTON_LOCATOR,
                "checked").equals(HomeProjectConstants.DARKMODE_CHECKER_BOOL);
        if (HomeProjectConstants.DARKMODE_CHECKER_BOOL == true) {

        }
    }

}
