package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserModification extends TestBase {

    @Test
    public void testNewTab() {
        app.getUser().openTabAndSwitch();
        app.getUser().pause(1000);
    }

    @Test
    public void changeAvatar() {
        app.getUser().clickOnAvatar();
        app.getUser().pause(2000);
        app.getUser().openUserProfile();
        app.getUser().goToAtlassianAccount();
        app.getUser().pause(3000);
        Assert.assertTrue(app.getUrl().contains("https://id.atlassian.com/manage-profile/profile-and-visibility"));

        app.getAtlassian().initChangePhoto();
        app.getAtlassian().uploadPhoto("C:\\Users\\user\\Desktop\\anna\\TelRun\\Lessons\\GitHub\\Trello_QA35\\src\\test\\resources\\avatar.jpg");
        app.getUser().pause(5000);
        app.getUser().returnToTrello();

        Assert.assertTrue(app.getUrl().contains("https://trello.com/"));


    }

}

