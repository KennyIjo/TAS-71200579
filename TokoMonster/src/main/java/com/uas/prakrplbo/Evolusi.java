package com.uas.prakrplbo;

import org.jetbrains.annotations.NotNull;

public class Evolusi extends Monster {
    private Monster monster1;
    private Monster monster2;

    public Evolusi(Monster monster1, Monster monster2) {
        super (monster1.getNama() + " " + monster2.getNama());
    }

    public String bersuara() {
        return monster1.bersuara() + " " + monster2.bersuara();
    }

    public String bergerak() {
        return Main.getMonsterSaya(1).bergerak();
    }

}
