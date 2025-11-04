package org.example.model;

import org.example.exceptions.OkladException;

public class SotrudnikPoKontraktu extends Sotrudnik {
    public SotrudnikPoKontraktu(String fio, String dolzhnost, double oklad) throws OkladException {
        super(fio, dolzhnost, oklad);
    }

    @Override
    public double rasschitatZarplatu() {
        try {
            return oklad;
        } catch (Exception e) {
            System.out.println("Ошибка в расчете зарплаты (контракт): " + e.getMessage());
            return 0;
        }
    }
}