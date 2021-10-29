package hou.duogwas.onthigplxa1.Class; /*
 ** Created by duogwas on 26/10/2021
 **/

import java.util.ArrayList;

public class Question {
    private String question; // Nội dung của câu hỏi
    private ArrayList<String> answer; // Các đáp án để lựa chọn
    private ArrayList<Integer> result; // Đáp án đúng
    private String image; // Đường dẫn ảnh nếu có
    private String reason; // Giải thích đáp án
    private ArrayList<Integer> userResult; //Đáp án của ng dùng chọn

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<String> getAnswer() {
        return answer;
    }

    public void setAnswer(ArrayList<String> answer) {
        this.answer = answer;
    }

    public ArrayList<Integer> getResult() {
        return result;
    }

    public void setResult(ArrayList<Integer> result) {
        this.result = result;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ArrayList<Integer> getUserResult() {
        return userResult;
    }

    public void setUserResult(ArrayList<Integer> userResult) {
        this.userResult = userResult;
    }

    public Question(String question, ArrayList<String> answer, ArrayList<Integer> result, String image, String reason, ArrayList<Integer> userResult) {
        this.question = question;
        this.answer = answer;
        this.result = result;
        this.image = image;
        this.reason = reason;
        this.userResult = userResult;
    }
}
