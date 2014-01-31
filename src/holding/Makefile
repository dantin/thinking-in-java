JAVAC=javac
JFLAGS=

bin=bin/

util-path=../../tools/

utils=\
	net/mindview/util/Print.java\
	net/mindview/util/Stack.java\
	net/mindview/util/TextFile.java\
	net/mindview/util/Sets.java\
	net/mindview/util/ContainerMethodDifferences.java

sources=\
	ApplesAndOrangesWithoutGenerics.java\
	ApplesAndOrangesWithGenerics.java\
	GenericsAndUpcasting.java\
	SimpleCollection.java\
	AddingGroups.java\
	AsListInference.java\
	PrintingContainers.java\
	../typeinfo/pets/Individual.java\
	../typeinfo/pets/Pet.java\
	../typeinfo/pets/Cat.java\
	../typeinfo/pets/Manx.java\
	../typeinfo/pets/Cymric.java\
	../typeinfo/pets/Rodent.java\
	../typeinfo/pets/Hamster.java\
	../typeinfo/pets/Mouse.java\
	../typeinfo/pets/Dog.java\
	../typeinfo/pets/Mutt.java\
	../typeinfo/pets/Rat.java\
	../typeinfo/pets/Pug.java\
	../typeinfo/pets/EgyptianMau.java\
	../typeinfo/pets/PetCreator.java\
	../typeinfo/pets/LiteralPetCreator.java\
	../typeinfo/pets/Pets.java\
	ListFeatures.java\
	SimpleIteration.java\
	CrossContainerIteration.java\
	ListIteration.java\
	LinkedListFeatures.java\
	StackTest.java\
	StackCollision.java\
	SetOfInteger.java\
	SortedSetOfInteger.java\
	SetOperations.java\
	UniqueWords.java\
	UniqueWordsAlphabetic.java\
	Statistics.java\
	PetMap.java\
	../typeinfo/pets/Person.java\
	MapOfList.java\
	QueueDemo.java\
	PriorityQueueDemo.java\
	InterfaceVsIterator.java\
	CollectionSequence.java\
	NonCollectionSequence.java\
	ForEachCollections.java\
	IterableClass.java\
	EnvironmentVariables.java\
	ArrayIsNotIterable.java\
	AdapterMethodIdiom.java\
	MultiIterableClass.java\
	ModifyingArraysAsList.java\
	ContainerMethods.java

norun=\
	ApplesAndOrangesWithoutGenerics.java\
	../typeinfo/pets/Individual.java\
	../typeinfo/pets/Pet.java\
	../typeinfo/pets/Cat.java\
	../typeinfo/pets/Manx.java\
	../typeinfo/pets/Cymric.java\
	../typeinfo/pets/Rodent.java\
	../typeinfo/pets/Hamster.java\
	../typeinfo/pets/Mouse.java\
	../typeinfo/pets/Dog.java\
	../typeinfo/pets/Mutt.java\
	../typeinfo/pets/Rat.java\
	../typeinfo/pets/Pug.java\
	../typeinfo/pets/EgyptianMau.java\
	../typeinfo/pets/PetCreator.java\
	../typeinfo/pets/LiteralPetCreator.java\
	../typeinfo/pets/Pets.java\
	../typeinfo/pets/Person.java

targets := $(filter-out $(norun:.java=.class), $(sources:.java=.class))

build: init util $(sources:.java=.class)

util: $(addprefix $(util-path), $(utils:.java=.class))

%.class: %.java
	$(JAVAC) $(JFLAGS) -cp $(bin) -d $(bin) $<

.PHONY: clean test init
init:
	mkdir -p $(bin)

clean:
	-rm -rf $(bin) *.class *~

test: build
	@for target in $(basename $(targets));do java -cp $(bin) $$target;done
