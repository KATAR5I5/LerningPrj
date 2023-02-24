package Patterns.Behavioral.TemplateMethod;

public class NewsWebSite extends WebSitePage {
    @Override
    public String pageBody() {
        return "Это тело страницы NewsPage";
    }
}
