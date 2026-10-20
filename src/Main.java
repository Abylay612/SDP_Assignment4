void main() {
    // Facade creation
    GameCharacterFacade heroFacade = new GameCharacterFacade();

    // Creating warrior with one line, hiding complexity under the hood.
    heroFacade.createNewHero("Aragorn", "Warrior", "Legendary Sword", "Steel Plate Armor");

    // Mage creation
    heroFacade.createNewHero("Gandalf", "Mage", "Magic Staff", "Robes of Wisdom");
}