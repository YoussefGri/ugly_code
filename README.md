# Refactoring avec IntelliJ – Correction du Code Smell (LLM) \*Primitive Obsession\*

Projet : binôme `Fadel Benomar / Youssef Grari`  
Langage : Java (Maven)  
But : décrire précisément les refactorings réalisés pour corriger le code smell \*Primitive Obsession\* et documenter une seconde approche entièrement automatisée par un LLM.

---

##  Refactoring complet réalisé par un LLM

Dans cette seconde approche, le programme initial contenant le code smell \*Primitive Obsession\* a été soumis à un LLM qui a appliqué l’ensemble des refactorings automatiquement, sans intervention manuelle. L’objectif était que le LLM détecte les primitives à encapsuler, propose les objets métiers pertinents, et adapte toutes les portions du code, y compris le `main`, pour que le programme refactoré reste fonctionnel.

###  Opérations de refactoring appliquées par le LLM

Le LLM a identifié le code smell et appliqué plusieurs refactorings :
- Extract Class pour créer les classes métiers : `Address`, `Email`, `PhoneNumber`, `Money`, `Discount`.
- Encapsulate Field : tous les champs primitifs des nouvelles classes sont privés avec getters/setters.
- Replace Data Value with Object : remplacement des `String` et `double` par des objets métiers.
- Change Method/Constructor Signature : ajustement des constructeurs de `Client` et `Order`.
- Mise à jour automatique de tous les appels dans le `main`.

Des Value Objects (`Email`, `Money`) ont été introduits, ouvrant la porte à des validations futures.


###  Code généré automatiquement par le LLM

Le LLM a produit un code complet et fonctionnel : classes extraites, versions refactorées de `Client` et `Order`, et `main` adapté. 
Le code respecte encapsulation, séparation des responsabilités et enrichissement des types de données. 
Le programme refactoré peut être compilé et exécuté immédiatement.





---
