package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeProjectConstants;
import com.crowdar.examples.constants.LoginHomeConstants;
import com.crowdar.examples.constants.TimeEntryConstants;
import org.testng.Assert;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class TimeEntryService {


    public static void addTimeEntry () {
        MobileActionManager.waitVisibility(TimeEntryConstants.LABEL_ENTRY_LOCATOR);
        MobileActionManager.click(TimeEntryConstants.ADD_ENTRY_BUTTON);
        Assert.assertTrue(MobileActionManager.isVisible(TimeEntryConstants.TASK_IMG_LOCATOR), TimeEntryConstants.VIEW_NOT_DISPLAYED_MESSAGE);

    }
    public static void scrollCarrousel() {
        MobileActionManager.click(TimeEntryConstants.HR_SCROLL_LOW_LOCATOR);
        MobileActionManager.click(TimeEntryConstants.HR_SCROLL_LOW_LOCATOR);
        MobileActionManager.click(TimeEntryConstants.HR_SCROLL_UP_LOCATOR);
        MobileActionManager.waitVisibility(TimeEntryConstants.LABEL_ENTRY_LOCATOR);
        MobileActionManager.click(TimeEntryConstants.MN_SCROLL_LOW_LOCATOR);
        MobileActionManager.click(TimeEntryConstants.MN_SCROLL_LOW_LOCATOR);
        MobileActionManager.click(TimeEntryConstants.MN_SCROLL_UP_LOCATOR);
        MobileActionManager.click(TimeEntryConstants.SAVE_ENTRY_BUTTON);
    }
    public static void checkTimeEntriesPage () {
        MobileActionManager.waitVisibility(LoginHomeConstants.TIME_ENTRIES_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(LoginHomeConstants.TIME_ENTRIES_LOCATOR), HomeProjectConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }
}
