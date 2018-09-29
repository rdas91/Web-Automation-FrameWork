package Front;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestTopPage extends FrontPage {

    FrontPage ObjOfFrontPage;
    @BeforeMethod
    public void init(){ObjOfFrontPage = PageFactory.initElements(driver, FrontPage.class);
    }
    @Test
    public void homeUrl() {
        getCurrentPageUrl();
    }
    @Test

    public void goSearchBar(){
        searchBar();
    }
    @Test
    public void goToday(){
        setTopToday();
    }
    @Test
    public void goNyWeather(){
        setTopNyWeather();
    }
    @Test
    public void goEnglish(){
        setTopEnglish();
    }
    @Test
    public void goSpanish(){
        setTopSpanish();
    }
    @Test
    public void goChinese(){
        setTopChinese();
    }
}
