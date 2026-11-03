public class PromptPay implements Payment {
    @Override
    public void pay(double money) {
        IO.println(String.format("use Mobile Application"));
        IO.println(String.format("Paid %s Baht using PromptPay", money));
    }
}