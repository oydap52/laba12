package org.example.model;

import org.example.exceptions.OkladException;
import org.example.exceptions.PremiyaException;

public class ShtatnyiSotrudnik extends Sotrudnik {
    private double premiya;

    public ShtatnyiSotrudnik(String fio, String dolzhnost, double oklad, double premiya)
            throws OkladException, PremiyaException {
        super(fio, dolzhnost, oklad);
        if (premiya < 0) throw new PremiyaException("Премия не может быть отрицательной: " + premiya);
        this.premiya = premiya;
    }

    @Override
    public double rasschitatZarplatu() {
        try {
            if (premiya < 0) throw new PremiyaException("Премия отрицательная: " + premiya);
            return oklad + premiya;
        } catch (PremiyaException e) {
            System.out.println("Ошибка в расчете зарплаты (штатный): " + e.getMessage());
            return oklad;
        } catch (Exception e) {
            System.out.println("Неизвестная ошибка: " + e.getMessage());
            return oklad;
        }
    }

    public double getPremiya() { return premiya; }
    public void setPremiya(double premiya) throws PremiyaException {
        if (premiya < 0) throw new PremiyaException("Премия не может быть отрицательной: " + premiya);
        this.premiya = premiya;
    }
}