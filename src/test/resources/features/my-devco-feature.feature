@Notes

  Feature: Yo como usuario deseo interactuar con las notas la pagina web

    Scenario: Yo como usuario deseo crear una nota de texto enriquecido con letra en negrita
      Given Yo como usuario deseo crear una nota de texto enriquecido
      Then Yo como usuario valido la creacion exitosa de la nota de texto

    Scenario: Yo como usuarilo deseo eliminar un articulo de una lista de 5 Elementos
      Given Yo como usuario selecciono la un articulo y lo elimino
      Then Yo como usuario valido que se elimine correctamente la nota

    Scenario: Yo como usuario deseo mover un articulo de posicion de una lista de 5 elementos
      Given Yo como usuario selecciono y muevo un articulo de la lista de 5 elementos
      Then Yo como usuario valido la nueva posicion del articulo