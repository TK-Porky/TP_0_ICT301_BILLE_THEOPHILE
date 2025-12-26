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
5. [ISP - Interface Segregation Principle](#isp-interface-segregation-principle)
6. [DIP - Dependency Inversion Principle](#dip-dependency-inversion-principle)

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

---

### ISP - Interface Segregation Principle

Ce principe stipule que les interfaces doivent être spécifiques et petites, et non grandes et génériques.

Dans le contexte du cours, nous avons une interface Worker qui contient des méthodes work() et eat(). Cependant, une classe RobotWorker ne mange pas, donc elle implémente l'interface Worker sans utiliser la méthode eat().

Dès lors, dans le cadre de ce TP, nous allons créer une interface Workable avec une méthode work() et une interface Eatable avec une méthode eat().

#### Avant refactoring :
- Une interface Worker contient des méthodes work() et eat().
- Une classe RobotWorker implémente l'interface Worker sans utiliser la méthode eat().

#### Après refactoring :
- Une interface Workable est créée avec une méthode work().
- Une interface Eatable est créée avec une méthode eat().
- Une classe HumanWorker implémente l'interface Workable et Eatable.
- Une classe RobotWorker implémente l'interface Workable.

#### Structure des fichiers :

```
ISP/
├── apres/
│   ├── EntityWorker.java
│   ├── Workable.java
│   └── Eatable.java
└── avant/          
    └── Worker.java
```

---

### DIP - Dependency Inversion Principle

Ce principe stipule que les classes doivent dépendre d'interfaces plutôt que d'implémentations.

Dans le contexte du cours, nous avons une classe OrderProcessor qui dépend d'une classe MySQLDatabase pour sauvegarder les commandes.

#### Avant refactoring :
- Une classe OrderProcessor dépend d'une classe MySQLDatabase pour sauvegarder les commandes.

#### Après refactoring :
- Une interface Database est créée avec une méthode saveOrder().
- Les classes MySQLDatabase et OrderProcessor implémentent l'interface Database.
- La classe OrderProcessor dépend d'une interface Database pour sauvegarder les commandes.

#### Structure des fichiers :

```
DIP/
├── apres/
│   ├── Database.java
│   ├── OrderProcessor.java
│   └── MySQLDatabase.java
└── avant/          
    └── OrderProcessor.java
```

---