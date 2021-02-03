package com.katalogus.project.model;

import com.katalogus.project.entity.Turnus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class StudentStatistic {

    private String studentName;

    private String neptunCode;

    private HashMap<String, Integer> percentages = new HashMap<>();

    private String warning;

    public void createWarning(Turnus turnus) {
        if (percentages.get("lecture") < turnus.getLecture()) {
            warning = warning.concat("Előadás");
        }
        if (percentages.get("practice") < turnus.getPractice()) {
            if (warning.length() == 0) {
                warning = warning.concat("Gyakorlat");
            } else {
                warning = warning.concat(", Gyakorlat");
            }
        }
        if (percentages.get("consultation") < turnus.getConsultation()) {
            if (warning.length() == 0) {
                warning = warning.concat("Konzultáció");
            } else {
                warning = warning.concat(", Konzultáció");
            }
        }
    }

}