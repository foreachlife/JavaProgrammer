package designpattern.lesson1.partertwo.character;

import designpattern.lesson1.partertwo.weapon.WeaponBehavior;
/**
 * @author yy
 * @data 2022/8/13 17:45
 */
public abstract class Character {

    WeaponBehavior weapon;

    /**
     * 打架
     */
    public void fight() {
        this.weapon.useWeaponBehavior();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
