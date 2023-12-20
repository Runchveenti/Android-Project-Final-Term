package vn.edu.nguyenngocanhthu.quizatapp;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {
    private static List<QuestionsList> cplusQuestions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Tạo câu hỏi và câu trả lời cho phần C++
        final QuestionsList question1 = new QuestionsList("Which of the following user-defined header file extension used in C++ ?", "hg", "cpp", "h", "hf", "h", "");
        final QuestionsList question2 = new QuestionsList("Which of the following is used for comments in C++ ?", "/* comment */", "// comment */", "// comment", "both // comment or /* comment */", "both // comment or /* comment */", "");
        final QuestionsList question3 = new QuestionsList("Which of the following type is provided by C++ but not C ?", "double", "bool", "int", "float", "bool", "");
        final QuestionsList question4 = new QuestionsList("Which of the following correctly declares an array in C++ ?", "array{10};", "array array[10];", "int array[10];", "int array;", "int array[10];", "");
        final QuestionsList question5 = new QuestionsList("What is Inheritance in C++ ?", "Deriving new classes from existing classes", "Overloading of classes", " Classes with same names", "Wrapping of data into a single class", " Deriving new classes from existing classes", "");
        final QuestionsList question6 = new QuestionsList("What happens if the following program is executed in C and C++ ?\nint new = 5;\n printf(\"%d\", new);", "Error in C and successful execution in C++", "Error in both C and C++", " Error in C++ and successful execution in C", "A successful run in both C and C++", "Error in C++ and successful execution in C", "");
        final QuestionsList question7 = new QuestionsList("Which of the following is used to terminate the function declaration in C++ ?", ";", "]", ")", ":", ";", "");
        final QuestionsList question8 = new QuestionsList("Pick the incorrect statement about inline functions in C++ ?", "Saves overhead of a return call from a function", "These functions are inserted/substituted at the point of call", "They are generally very large and complicated function", "They reduce function call overheads", "They are generally very large and complicated function", "");
        final QuestionsList question9 = new QuestionsList("What is abstract class in C++ ?", "Any Class in C++ is an abstract class", "Class from which any class is derived", "Class specifically used as a base class with atleast one virtual functions", "Class specifically used as a base class with atleast one pure virtual functions", "Class specifically used as a base class with atleast one pure virtual functions", "");
        final QuestionsList question10 = new QuestionsList("Which concept allows you to reuse the written code in C++ ?", "Inheritance", "Polymorphism", "Abstraction", "Encapsulation", "Inheritance", "");

        // Thêm các câu hỏi vừa tạo vào List
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }
    private static List<QuestionsList> androidQuestions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Tạo câu hỏi và câu trả lời cho phần Android
        final QuestionsList question1 = new QuestionsList("What is Android development ?", "Creating applications for iOS devices", "Building applications for devices running on the Android operating system", "Developing applications for Windows computers", "Designing web applications", "Building applications for devices running on the Android operating system", "");
        final QuestionsList question2 = new QuestionsList("Which programming languages are commonly used for Android app development ?", "Java and Kotlin", "Python and C++","JavaScript and Ruby", "PHP and Swift", "Java and Kotlin","");
        final QuestionsList question3 = new QuestionsList("What is the primary Integrated Development Environment (IDE) used for Android development ?", "Eclipse","Visual Studio Code","NetBeans","Android Studio","Android Studio","");
        final QuestionsList question4 = new QuestionsList("What is an Activity in Android development ?","A standalone application","A component representing a single screen with a user interface","A background process running in the device","A service that runs in the background to perform tasks","A component representing a single screen with a user interface","");
        final QuestionsList question5 = new QuestionsList("What are Fragments in Android development ?","Modular components used to build user interfaces","Code snippets for reusing in different projects","Libraries used for networking tasks","Images and icons used for app design","Modular components used to build user interfaces","");
        final QuestionsList question6 = new QuestionsList("How can Android apps request permissions to access device features or sensitive data ?","Permissions are automatically granted during app installation","Permissions can be accessed through the Android Manifest file","Android apps do not require permissions","Permissions can be requested programmatically using Java or Kotlin","Permissions can be accessed through the Android Manifest file","");
        final QuestionsList question7 = new QuestionsList("Which XML-based language is used to define the layout and components of an Android app’s user interface ?","HTML", "CSS","XML","JSON","XML","");
        final QuestionsList question8 = new QuestionsList("What is the Android Software Development Kit (SDK) ?","The primary programming language used for Android development","The set of tools and libraries to create Android apps","The user interface of the Android operating system","The official app store for Android devices","The set of tools and libraries to create Android apps","");
        final QuestionsList question9 = new QuestionsList("Which language was introduced by Google as an official language for Android development, alongside Java ?","C#","Swift","Python","Kotlin","Kotlin","");
        final QuestionsList question10 = new QuestionsList("What does the “R” in R.id represent in Android development ?","Resource","Result","Reference","Root","Reference","");

        // Thêm các câu hỏi vừa tạo vào List
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }

    private static List<QuestionsList> cssQuestions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Tạo câu hỏi và câu trả lời cho phần CSS
        final QuestionsList question1 = new QuestionsList("Which CSS property allows you to set multiple list properties at once ?","List-Style-Type","List-Style","List-Style-Position","List-Style-Image","List-Style","");
        final QuestionsList question2 = new QuestionsList("Which CSS property determines how much the text should be emblazoned ?","Font-Weight","Font-Size","Font-Family","Font-Style","Font-Weight","");
        final QuestionsList question3 = new QuestionsList("What is the latest version of CSS available ?","CSS2","CSS3","CSS3.1","CSS4","CSS3","");
        final QuestionsList question4 = new QuestionsList("What does CSS stand for ?","Computer Style Sheets","Creative Style Sheets","Cascading Style Sheets","Colorful Style Sheets","Cascading Style Sheets","");
        final QuestionsList question5 = new QuestionsList("How can you include comments in CSS ?","<!-- This is a comment -->","// This is a comment","/* This is a comment */","# This is a comment","/* This is a comment */","");
        final QuestionsList question6 = new QuestionsList("Which CSS property is used for changing the background color of an element ?","color","background-color","bgcolor","background","background-color","");
        final QuestionsList question7 = new QuestionsList("How do you select all paragraphs with the class \"intro\" in CSS ?","p.intro",".intro p","intro.p","#intro p","p.intro","");
        final QuestionsList question8 = new QuestionsList("What does the CSS property display: none; do ?","Hides an element","Makes an element transparent","Adds a border to an element","Changes the font size of an element","Hides an element","");
        final QuestionsList question9 = new QuestionsList("Which CSS pseudo-class is used to select an element when a user interacts with it ?",":hover",":active",":focus",":visited",":hover","");
        final QuestionsList question10 = new QuestionsList("What does the CSS property position: relative; do ?","Positions an element relative to its normal position in the document flow","Fixes an element's position on the page","Floats an element to the left or right","Changes the font family of an element","Positions an element relative to its normal position in the document flow","");

        // Thêm các câu hỏi vừa tạo vào List
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }

    private static List<QuestionsList> htmlQuestions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Tạo câu hỏi và câu trả lời cho phần HTML
        final QuestionsList question1 = new QuestionsList("What does HTML stand for ?","HyperText Markup Language","High-Level Text Management Language","Hyperlink and Text Markup Language","HyperText Management Language","HyperText Markup Language","");
        final QuestionsList question2 = new QuestionsList("Which HTML tag is used for creating a hyperlink ?","<link>","<a>","<href>","<url>","<a>","");
        final QuestionsList question3 = new QuestionsList("What is the correct HTML tag for inserting a line break ?","<lb>","<newline>","<br>","<break>","<br>","");
        final QuestionsList question4 = new QuestionsList("Which HTML element is used for creating an unordered list ?","<ol>","<li>","<dl>","<ul>","<ul>","");
        final QuestionsList question5 = new QuestionsList("Which HTML tag is used for defining the structure of an HTML document, including the head and body sections ?","<header>","<structure>","<html>","<document>","<html>","");
        final QuestionsList question6 = new QuestionsList("Which HTML tag is used for creating a table ?","<table>","<tr>","<td>","<th>","<table>","");
        final QuestionsList question7 = new QuestionsList("What is the purpose of the HTML attribute colspan ?","Sets the column width in a table","Merges multiple table cells horizontally","Defines the number of columns in a table","Specifies the color of a table cell","Merges multiple table cells horizontally","");
        final QuestionsList question8 = new QuestionsList("Which HTML tag is used for embedding an audio file in a webpage ?","<audio>","<sound>","<media>","<music>","<audio>","");
        final QuestionsList question9 = new QuestionsList("What is the purpose of the HTML <footer> element ?","Represents the main content of the document","Contains metadata about the document","Defines a footer for a section or page","Creates a navigation menu","Defines a footer for a section or page","");
        final QuestionsList question10 = new QuestionsList("Which HTML tag is used for creating an image in a webpage ?","<img>","<image>","<picture>","<graphic>","<img>","");

        // Thêm các câu hỏi vừa tạo vào List
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }
    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "C++":
                return cplusQuestions();
            case "Android":
                return androidQuestions();
            case "CSS":
                return cssQuestions();
            default:
                return htmlQuestions();
        }
    }
}
