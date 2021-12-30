module com.example.java_2_javafx_lesson_4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_2_javafx_lesson_4 to javafx.fxml;
    exports com.example.java_2_javafx_lesson_4;
}