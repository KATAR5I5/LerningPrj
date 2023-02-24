package Patterns.Behavioral.TemplateMethod;

public abstract class WebSitePage {
    public void showPage(){
        System.out.println("Headers");
        System.out.println(pageBody());
        System.out.println("Footer");
    }

    protected abstract String pageBody();
}
