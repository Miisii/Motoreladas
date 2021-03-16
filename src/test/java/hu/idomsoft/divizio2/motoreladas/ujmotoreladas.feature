# language: hu
# Tags: optional

Jellemző: új motor beszerzése rendelésre

  Forgatókönyv: teljes összeggel
    Amennyiben megrendelés érkezett egy motorra
    Ha az előleg ki lett fizetve
    Akkor a motort meg lehet rendelni a gyártól

  Forgatókönyv: hitellel, előleggel
    Amennyiben megrendelés érkezett egy motorra
    Ha az előleg ki lett fizetve
    És megkapta a banktól az elbírált hitelt
    Akkor a motort meg lehet rendelni a gyártól

  Forgatókönyv: motorbeszámítással
    Amennyiben megrendelés érkezett egy motorra
    Akkor a beszámítandó motor értéke levonásra kerül a teljes vételárból
    Ha az előleg ki lett fizetve
    Akkor a motort meg lehet rendelni a gyártól

  Forgatókönyv: autóbeszámítással
    Amennyiben megrendelés érkezett egy motorra
    Akkor a beszámítandó autó értéke levonásra kerül a teljes vételárból
    Ha az előleg ki lett fizetve
    Akkor a motort meg lehet rendelni a gyártól