package ma.eai.titre.manex.batchs.ChargCoursAutoBam.service;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.Cours;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.Devise;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.exception.ValidationException;

import java.util.Calendar;

public class ValidationService {
    public void validerDateCours(Calendar dateCours, Calendar dateJour) throws ValidationException {
        if (dateCours.compareTo(dateJour) > 0) {
            throw new ValidationException("Date cours future : " + dateCours.getTime());
        }
    }

    public void validerCommissionsBKAM(Double comR, Double comV) throws ValidationException {
        if (comR == null || comV == null || comR > 1 || comV > 1) {
            throw new ValidationException("Commissions BKAM non valides : R=" + comR + ", V=" + comV);
        }
    }

    public void validerDevise(Devise devise) throws ValidationException {
        if (devise == null || devise.getCodebam() == null) {
            throw new ValidationException("Devise invalide ou introuvable");
        }
    }

    public void validerBornesCours(Cours cours) {
        if (cours.getCoursacs().compareTo(cours.getCoursMinBam()) < 0) {
            cours.setCoursacs(cours.getCoursMinBam());
        }
        if (cours.getCoursvcs().compareTo(cours.getCoursMaxBam()) > 0) {
            cours.setCoursvcs(cours.getCoursMaxBam());
        }
        if (cours.getCoursGab().compareTo(cours.getCoursMinBam()) < 0) {
            cours.setCoursGab(cours.getCoursMinBam());
        }
    }
}
