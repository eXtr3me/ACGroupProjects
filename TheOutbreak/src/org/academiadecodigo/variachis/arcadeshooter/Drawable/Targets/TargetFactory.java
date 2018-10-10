package org.academiadecodigo.variachis.arcadeshooter.Drawable.Targets;

import org.academiadecodigo.variachis.arcadeshooter.Game;

public class TargetFactory {

    private Target target;
    private int currentNumberOfTargets = 0;
    private int maxNumberTargets;

    // Game sets the maximum number of targets
    public void setMaxNumberTargets(int targets) {

        maxNumberTargets = targets;
    }

    // Creation of the 20 initial targets (7 friends, 7 foes, 3 ammo, 3 Hp) in the offStage list
    public Target newTarget() {

        if (this.currentNumberOfTargets < maxNumberTargets * 0.35) {
            this.currentNumberOfTargets++;
            return new Foe("/image/ZombieAssets/MaleZombieWalkRight/Walk (1).png");
        }

        if (this.currentNumberOfTargets >= maxNumberTargets * 0.35 && currentNumberOfTargets < maxNumberTargets * 0.7) {
            currentNumberOfTargets++;
            return new Victim("/image/Innocent/walk (1).png");
        }

        if (currentNumberOfTargets >= maxNumberTargets * 0.7 && currentNumberOfTargets < maxNumberTargets * 0.85) {
            currentNumberOfTargets++;
            return new HPBonus("/image/FirstAidKit.png");
        }
        currentNumberOfTargets++;
        return new AmmoBonus("/image/Ammo.png");


    }



}