# TP_0_ICT301_BILLE_THEOPHILE

## Auteur

**Nom :** BILLE THEOPHILE

**Prénom :** KEVIN

**Spécialité :** Génie Logiciel

**Matricule :** 23V2291

## Sommaire

1. [Présentation des principes SOLID](#presentation-des-princitations-solid)
2. [SRP - Single Responsibility Principle](#srp-single-responsibility-principle)
3. [OCP - Open/Closed Principle](#ocp-open-closed-principle)

---

### Présentation des principes SOLID

Les principes SOLID sont des règles de conception logiciel qui visent à améliorer la qualité du code en le rendant plus facile à maintenir, à tester et à évoluer.

### SRP - Single Responsibility Principle

Ce concept stipule que chaque classe devrait avoir une seule responsabilité et donc une seule raison de changer.

Dans le contexte du cours, nous avons une classe Book qui gère les données, l'affichage, la sauvegarde en base de données et la logique métier. Par conséquent, dans le cadre de ce TP, nous allons préférer séparer ces responsabilités en plusieurs classes distinctes.

#### Avant refactoring :
- Une classe Book gère les données, l'affichage, la sauvegarde en base de données et la logique métier.

#### Après refactoring :
- Chaque responsabilité est confiée à une classe spécifique.
- La classe Book gère les données.
- La classe BookPrinter gère l'affichage.
- La classe BookSaver gère la sauvegarde en base de données.
- La classe BookBusinessLogic gère la logique métier.

#### Structure des fichiers :

```
SRP/
├── apres/
│   ├── Book.java
│   ├── BookPrinter.java
│   ├── BookSaver.java
│   └── BookBusinessLogic.java
└── avant/          
    └── Book.java
```

---

### OCP - Open/Closed Principle

Ce principe stipule que les classes doivent être ouvertes à l'extension (on peut ajouter de nouvelles fonctionnalités) mais fermées à la modification (on ne doit pas modifier le code existant).

Dans le contexte du cours, nous avons une classe AreaCalculator qui calcule l'aire des différentes formes (Rectangle, Cercle) en utilisant des `if/else` et/ou des `instanceof`. Dans le cas présent, ajouter une nouvelle forme nécessiterait de modifier le code existant.

Dès lors, dans le cadre de ce TP, nous avons créer une interface Shape avec une méthode calculateArea() qui sera implémentée par les différentes formes (Rectangle, Cercle).

#### Avant refactoring :
- Une classe AreaCalculator calcule l'aire des différentes formes en utilisant des `if/else` et/ou des `instanceof`.

#### Après refactoring :
- Une interface Shape est créée avec une méthode calculateArea().
- Les classes Rectangle et Circle implémentent l'interface Shape.
- Une classe AreaCalculator calcule l'aire des différentes formes en utilisant l'interface Shape.

#### Structure des fichiers :

```
OCP/
├── apres/
│   ├── AreaCalculator.java
│   ├── Rectangle.java
│   ├── Shape.java
│   └── Circle.java
└── avant/          
    └── AreaCalculator.java
```