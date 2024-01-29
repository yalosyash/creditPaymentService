public class CreditPaymentService {
    public float calculate(int sum, int years) {
        int month = years * 12;
        float percent = 9.99f;
        float payment = sum * percent / (1 + percent / 12) * month / ((1 + percent / 12) * month - 1);
        return payment;
    }
}

/*
    Sе = S*P /12*(1+P/12)N/((1+P/12)N -1), где
    S – сумма кредита,
    P – размер годовой процентной ставки,
    N – количество месяцев, в течение которых производятся выплаты.
 */