package vn.edu.nguyenngocanhthu.quizatapp;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {
    private static List<QuestionsList> cplusQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Tạo câu hỏi và câu trả lời
        final QuestionsList question1 = new QuestionsList("Which of the following user-defined header file extension used in C++ ?", "hg", "cpp", "h", "hf", "h", "");
        final QuestionsList question2 = new QuestionsList("Which of the following is used for comments in C++ ?", "/* comment */", "// comment */", "// comment", "both // comment or /* comment */", "both // comment or /* comment */", "");
        final QuestionsList question3 = new QuestionsList(" Which of the following type is provided by C++ but not C ?", "double", "bool", "int", "float", "bool", "");
        final QuestionsList question4 = new QuestionsList("Which of the following correctly declares an array in C++ ?", "array{10};", "array array[10];", "int array[10];", "int array;", "int array[10];", "");
        final QuestionsList question5 = new QuestionsList("What is Inheritance in C++ ?", "Deriving new classes from existing classes", "Overloading of classes", " Classes with same names", "Wrapping of data into a single class", " Deriving new classes from existing classes", "");
        final QuestionsList question6 = new QuestionsList("What happens if the following program is executed in C and C++ ?\nint new = 5;\n printf(\"%d\", new);", "Error in C and successful execution in C++", "Error in both C and C++", " Error in C++ and successful execution in C", "A successful run in both C and C++", "Error in C++ and successful execution in C", "");
        final QuestionsList question7 = new QuestionsList("Which of the following is used to terminate the function declaration in C++ ?", ";", "]", ")", ":", ";", "");
        final QuestionsList question8 = new QuestionsList("Pick the incorrect statement about inline functions in C++ ?", "Saves overhead of a return call from a function", "These functions are inserted/substituted at the point of call", "They are generally very large and complicated function", "They reduce function call overheads", "They are generally very large and complicated function", "");
        final QuestionsList question9 = new QuestionsList("What is abstract class in C++ ?", "Any Class in C++ is an abstract class", "Class from which any class is derived","Class specifically used as a base class with atleast one virtual functions", "Class specifically used as a base class with atleast one pure virtual functions", "Class specifically used as a base class with atleast one pure virtual functions", "");
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

    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "c++":
                return cplusQuestions();
        }
    }
}
