package programs.stringExamples;

import org.testng.annotations.Test;

public class ExampleSplit {
//    Split a sentence by space
    @Test
    public void test1(){
        String str = "Welcome to Wipro Interview";
        String[] words = str.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
//Split using comma (CSV data)
    @Test
    public void test2(){
        String data = "Siddu,QA,Automation,India";
        String[] values = data.split(",");
        for (String val : values) {
            System.out.println(val);
        }
    }
//Split using multiple delimiters (space + comma)
    @Test
    public void test3(){
        String str = "Java, Selenium TestNG Cucumber";
        String[] arr = str.split("[, ]+");
        for (String s : arr) {
            System.out.println(s);
        }
    }
//    Split sentence into words (ignore special characters)
    @Test
    public void test4(){
        String str = "Wipro@2026!Interview#Java";
        String[] words = str.split("\\W+");

        for (String w : words) {
            System.out.println(w);
        }
    }
//    Split string into characters
    @Test
    public void test5(){
        String str = "Wipro";
        String[] chars = str.split("");

        for (String ch : chars) {
            System.out.println(ch);
        }
    }
//    Split and count number of words
    @Test
    public void test6(){
        String str = "Java Selenium Automation";
        String[] words = str.split("\\s+");
        System.out.println("Word Count = " + words.length);
    }
//    Split date string (Real-time example)
    @Test
    public void test7(){
        String date = "15-02-2026";
        String[] arr = date.split("-");

        System.out.println("Day: " + arr[0]);
        System.out.println("Month: " + arr[1]);
        System.out.println("Year: " + arr[2]);
    }
//    Split URL (Automation interview question)
    @Test
    public void test8(){
        String url = "https://www.wipro.com/careers/jobs";
        String[] parts = url.split("/");

        for (String p : parts) {
            System.out.println(p);
        }
    }
//    Split with limit parameter
    @Test
    public void test9(){
        String str = "Java-Selenium-TestNG-Cucumber";
        String[] arr = str.split("-", 2);
        for (String s : arr) {
            System.out.println(s);
        }
    }
//    Extract only numbers from string
    @Test
    public void test10(){
        String str = "Wipro123Automation456";
        String[] nums = str.split("\\D+");
        for (String n : nums) {
            if (!n.isEmpty()) {
                System.out.println(n);
            }
        }
    }
}

/*
| **Regex**   | **Meaning**                | **Example Input String**   | **Code Snippet**         | **Output**                       |     |               |     |                 |
| ----------- | -------------------------- | -------------------------- | ------------------------ | -------------------------------- | --- | ------------- | --- | --------------- |
| `" "`       | Single space               | `"Java Selenium"`          | `str.split(" ")`         | `["Java","Selenium"]`            |     |               |     |                 |
| `\\s+`      | One or more whitespace     | `"Java   Selenium TestNG"` | `str.split("\\s+")`      | `["Java","Selenium","TestNG"]`   |     |               |     |                 |
| `,`         | Comma                      | `"QA,Automation,India"`    | `str.split(",")`         | `["QA","Automation","India"]`    |     |               |     |                 |
| `[, ]+`     | Comma or space             | `"Java, Selenium TestNG"`  | `str.split("[, ]+")`     | `["Java","Selenium","TestNG"]`   |     |               |     |                 |
| `\\W+`      | Non-word characters        | `"Wipro@2026#Java!"`       | `str.split("\\W+")`      | `["Wipro","2026","Java"]`        |     |               |     |                 |
| `\\d+`      | One or more digits         | `"Java123Selenium456"`     | `str.split("\\d+")`      | `["Java","Selenium"]`            |     |               |     |                 |
| `\\D+`      | One or more non-digits     | `"ID45CODE89"`             | `str.split("\\D+")`      | `["45","89"]`                    |     |               |     |                 |
| `-`         | Hyphen                     | `"15-02-2026"`             | `str.split("-")`         | `["15","02","2026"]`             |     |               |     |                 |
| `/`         | Forward slash              | `"https://www.test.com"`   | `str.split("/")`         | `["https:","","www.test.com"]`   |     |               |     |                 |
| `\\.`       | Dot (escaped)              | `"www.google.com"`         | `str.split("\\.")`       | `["www","google","com"]`         |     |               |     |                 |
| `""`        | Empty string               | `"Wipro"`                  | `str.split("")`          | `["W","i","p","r","o"]`          |     |               |     |                 |
| `:`         | Colon                      | `"user:admin:manager"`     | `str.split(":")`         | `["user","admin","manager"]`     |     |               |     |                 |
| `\          | `                          | Pipe (escaped)             | `"A                      | B                                | C"` | `str.split("\ | ")` | `["A","B","C"]` |
| `_`         | Underscore                 | `"QA_Automation_Test"`     | `str.split("_")`         | `["QA","Automation","Test"]`     |     |               |     |                 |
| `;`         | Semicolon                  | `"Java;Selenium;Cucumber"` | `str.split(";")`         | `["Java","Selenium","Cucumber"]` |     |               |     |                 |
| `\\s*,\\s*` | Comma with optional spaces | `"Java, Selenium ,TestNG"` | `str.split("\\s*,\\s*")` | `["Java","Selenium","TestNG"]`   |     |               |     |                 |

 */
