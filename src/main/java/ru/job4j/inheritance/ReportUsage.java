package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        String text = report.generate("Report name", "Report body");
        System.out.println(text);
        HtmlReport reportHTML = new HtmlReport();
        text = reportHTML.generate("Report name", "Report body");
        System.out.println(text);
        JSONReport reportJSON = new JSONReport();
        text = reportJSON.generate("Report name", "Report body");
        System.out.println(text);
    }
}
