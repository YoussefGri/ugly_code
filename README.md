# Refactoring avec IntelliJ – Correction du Code Smell binome(Fadel Benomar / Youssef Grari) \*Primitive Obsession -Too much data is represented using primitives instead of specific classes.\*

Ce document décrit précisément les étapes réalisées sous IntelliJ IDEA pour corriger le code smell de mon binome Grari Youssef **Primitive Obsession** dans le code fourni.
Les refactorings ont été effectués uniquement à l’aide des outils intégrés de l’IDE, sans ajout manuel de code (sauf renommage mineur si nécessaire).

---

## 🟦 Étape 1 – Extraire la classe `Address` (Extract Class)

Dans la classe `Client`, sélectionner les champs suivants :

- `String address`
- `String city`
- `String postalCode`
- `String country`

Puis :
- Clic droit → Refactor → Extract → Class…
- Paramètres :
    - Nom de la classe : `Address`
    - Option : *Replace fields with new class*

IntelliJ génèrera automatiquement la classe `Address` et remplacera les champs dans `Client` par une instance de `Address`.

## 🟦 Étape 2 – Modifier le constructeur de `Client` (Change Signature)

Placer le curseur sur le constructeur de `Client` :
- Refactor → Change Signature
- Modifier la signature en remplaçant les paramètres primitifs (`String address`, `String city`, ...) par un seul objet : `Address address`

IntelliJ met automatiquement à jour :
- le constructeur
- les champs internes

## 🟦 Étape 3 – Encapsuler les champs dans `Address`

Dans la classe `Address` :
- Refactor → Encapsulate Fields
- Options : Use getters and setters


## 🟦 Étape 4 – Extraire la classe `Email`

Sélectionner le champ `String email` dans `Client` :
- Refactor → Extract → Class
- Nom de la classe : `Email`

IntelliJ remplace automatiquement le champ dans `Client` .

## 🟦 Étape 5 – Extraire la classe `PhoneNumber`

Même procédure que pour `Email` :
- Clic droit → Refactor → Extract Class
- Nom de la classe : `PhoneNumber`


## 🟦 Étape 6 – Refactoriser `Order` avec une classe `Money`

Dans la classe `Order`, sélectionner :
- `double price`
- `String currency`

Puis :
- Refactor → Extract Class → `Money`
- Ensuite, Refactor → Change Signature pour remplacer `(double price, String currency)` par `(Money price)`


## 🟦 Étape 7 – Vérifier que `main` compile toujours

Lors des refactorings, IntelliJ propose : Yes / Preview / Do Refactor. Toujours accepter pour que les appels soient mis à jour automatiquement, malgres que ca ne se fait pas .

Vérifications à effectuer :
- Aucun appel n’est cassé
- Les instanciations sont automatiquement adaptées
- Le programme reste exécutable

---

Notes :
- Préférer les refactorings intégrés de l'IDE pour éviter les erreurs manuelles.
- Après chaque refactoring, lancer la compilation et les tests unitaires pour valider les modifications.
