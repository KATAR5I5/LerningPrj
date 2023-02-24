package Patterns.Behavioral.TemplateMethod;

public class WebSiteRunner {
    public static void main(String[] args) {
        WebSitePage wsp1 = new NewsWebSite();
        WebSitePage wsp2 = new JobsWebSite();

        wsp1.showPage();
        System.out.println("----------------------------------------");
        wsp2.showPage();

    }
}
