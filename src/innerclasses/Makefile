JAVAC=javac
JFLAGS=

bin=bin/

util-path=../../tools/

utils=\
	net/mindview/util/Print.java

sources=\
	Parcel1.java\
	Parcel2.java\
	Sequence.java\
	DotThis.java\
	DotNew.java\
	Parcel3.java\
	Contents.java\
	Destination.java\
	TestParcel.java\
	Parcel5.java\
	Parcel6.java\
	Parcel7.java\
	Parcel7b.java\
	Wrapping.java\
	Parcel8.java\
	Parcel9.java\
	AnonymousConstructor.java\
	Parcel10.java\
	Factories.java\
	Games.java\
	Parcel11.java\
	ClassInInterface.java\
	TestBed.java\
	MultiNestingAccess.java\
	MultiInterfaces.java\
	MultiImplementation.java\
	Callbacks.java\
	controller/Event.java\
	controller/Controller.java\
	GreenhouseControls.java\
	GreenhouseController.java\
	InheritInner.java\
	BigEgg.java\
	BigEgg2.java\
	LocalInnerClass.java

norun=\
	Contents.java\
	Destination.java\
	Wrapping.java\
	ClassInInterface.java\
	TestBed.java\
	controller/Event.java\
	controller/Controller.java\
	GreenhouseControls.java\
	GreenhouseController.java

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
	java -cp $(bin) ClassInInterface\$$Test
	java -cp $(bin) TestBed\$$Tester
	java -cp $(bin) GreenhouseController 5000