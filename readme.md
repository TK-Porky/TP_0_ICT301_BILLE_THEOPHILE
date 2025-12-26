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
4. [LSP - Liskov Substitution Principle](#lsp-liskov-substitution-principle)


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

---

### LSP - Liskov Substitution Principle

Ce principe stipule que les classes filles doivent pouvoir remplacer leurs classes mères sans altérer le comportement du programme.

Dans le contexte du cours, nous avons une classe Square qui étend la classe Rectangle. Cependant, la classe Square modifie le comportement de la classe Rectangle en modifiant la largeur et la hauteur de la même manière.

Par conséquent, dans le cadre de ce TP, nous allons créer une interface commune Shape pour les classes Rectangle et Square.

#### Avant refactoring :
- Une classe Square étend la classe Rectangle.
- La classe Square modifie le comportement de la classe Rectangle en modifiant la largeur et la hauteur de la même manière.

#### Après refactoring :
- Une interface Shape est créée avec une méthode calculateArea().
- Les classes Rectangle et Square implémentent l'interface Shape.
- La classe Square modifie le comportement de la classe Rectangle en modifiant la largeur et la hauteur de la même manière.

```
LSP/
├── apres/
│   ├── Rectangle.java
│   ├── Shape.java
│   └── Square.java
└── avant/          
    └── Square.java
```
