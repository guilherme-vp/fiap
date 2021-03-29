-- CreateTable
CREATE TABLE "Ninja" (
    "id" SERIAL NOT NULL,
    "nome" TEXT NOT NULL,
    "nivel" TEXT DEFAULT E'Academia',
    "idade" INTEGER NOT NULL,
    "createdAt" TIMESTAMP(3) NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updatedAt" TIMESTAMP(3) NOT NULL,
    "vilaId" INTEGER,

    PRIMARY KEY ("id")
);

-- CreateTable
CREATE TABLE "Vila" (
    "id" SERIAL NOT NULL,
    "nome" TEXT NOT NULL,
    "lider" TEXT NOT NULL,
    "shinobi" TEXT,
    "createdAt" TIMESTAMP(3) NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updatedAt" TIMESTAMP(3) NOT NULL,

    PRIMARY KEY ("id")
);

-- AddForeignKey
ALTER TABLE "Ninja" ADD FOREIGN KEY ("vilaId") REFERENCES "Vila"("id") ON DELETE SET NULL ON UPDATE CASCADE;
