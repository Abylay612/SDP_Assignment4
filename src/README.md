# Assignment #4 — Facade Pattern (`GameCharacter`)

## Project Overview
This project implements the **Facade** structural design pattern in Java as part of the Software Design Patterns course. The application models a complex subsystem for creating and initializing a game character, hiding the underlying complexity behind a unified and simplified interface.

## Subsystem Architecture (4+ Collaborating Classes)
The system consists of the following components:
1. **`CharacterAttributes`** — Handles the generation of base statistics (name, role, core stats).
2. **`WeaponEquipSystem`** — Manages weapon selection and attack parameter modifications.
3. **`ArmorEquipSystem`** — Handles protective gear assignment and defense calculation.
4. **`InventorySystem`** — Allocates starting items, potions, and currency.
5. **`GameCharacterFacade`** — The main facade class that coordinates the subsystem components in the correct order.

---

## Clean Code Principles Applied

1. **Meaningful Names:**
   Classes, methods, and parameters (`GameCharacterFacade`, `WeaponEquipSystem`, `createNewHero`) use descriptive, domain-specific names that make the API self-explanatory without requiring excessive comments.

2. **Single Responsibility Principle:**
   Each subsystem class has a single, well-defined responsibility (e.g., `InventorySystem` only deals with inventory). The Facade itself focuses strictly on *coordination* rather than reimplementing business logic.

3. **Encapsulation / No Leaking of Subsystem Details:**
   The Facade's public method exposes a simple interface (`createNewHero`) while completely shielding the client (`Main`) from the internal details of the underlying subsystem classes.

4. **Small, Focused Classes:**
   Subsystem classes are kept small and cohesive, with narrow scopes of responsibility, making the codebase easier to maintain, test, and understand.

5. **Client Independence (Loose Coupling):**
   The subsystem classes remain entirely unaware of the Facade's existence (no back-references). Advanced clients can still instantiate and interact with individual subsystem components directly if needed.

---

## How to Run
1. Clone the repository.
2. Compile all `.java` files:
   ```bash
   javac *.java