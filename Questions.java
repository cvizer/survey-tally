package YourVoteCounts;

public class Questions {

    public int questionID;
    public String question;
    public String answerOne;
    public String answerTwo;
    public String answerThree;
    public String answerFour;

    public Questions() {}
    public Questions(int questionID, String question, String answerOne, String answerTwo, String answerThree, String answerFour) {
        this.setQuestionID(questionID);
        this.setQuestion(question);
        this.setAnswerOne(answerOne);
        this.setAnswerTwo(answerTwo);
        this.setAnswerThree(answerThree);
        this.setAnswerFour(answerFour);
    }

    // Setters
    public void setAnswerFour(String answerFour) {
        this.answerFour = answerFour;
    }

    public void setAnswerThree(String answerThree) {
        this.answerThree = answerThree;
    }

    public void setAnswerTwo(String answerTwo) {
        this.answerTwo = answerTwo;
    }

    public void setAnswerOne(String answerOne) {
        this.answerOne = answerOne;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    // getters

    public String getAnswerFour() {
        return answerFour;
    }

    public String getAnswerThree() {
        return answerThree;
    }

    public String getAnswerTwo() {
        return answerTwo;
    }

    public String getAnswerOne() {
        return answerOne;
    }

    public String getQuestion() {
        return question;
    }

    public int getQuestionID() { return questionID; }

}
