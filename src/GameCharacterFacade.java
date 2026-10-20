public class GameCharacterFacade {
    private final CharacterAttributes attributes;
    private final WeaponEquipmentSystem weaponSystem;
    private final ArmorEquipmentSystem armorSystem;
    private final InventorySystem inventorySystem;

    public GameCharacterFacade() {
        this.attributes = new CharacterAttributes();
        this.weaponSystem = new WeaponEquipmentSystem();
        this.armorSystem = new ArmorEquipmentSystem();
        this.inventorySystem = new InventorySystem();
    }

    public void createNewHero(String name, String role, String weapon, String armor) {
        System.out.println("=== Beginning of character creation process ===");
        attributes.generateStats(name, role);
        weaponSystem.equipWeapon(weapon);
        armorSystem.equipArmor(armor);
        inventorySystem.giveStartingItems();
        System.out.println("=== Character creation is done!  ===\n");
    }
}
