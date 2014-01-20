JAVAC=javac
JFLAGS=

bin=bin/

util-path=../../tools/

utils=\
	net/mindview/util/Print.java\
	net/mindview/simple/Vector.java\
	net/mindview/simple/List.java

sources=\
	FullQualification.java\
	SingleImport.java\
	mypackage/MyClass.java\
	QualifiedMyClass.java\
	ImportedMyClass.java\
	LibTest.java\
	PrintTest.java\
	dessert/Cookie.java\
	Dinner.java\
	Pie.java\
	Cake.java\
	IceCream.java\
	ChocolateChip.java\
	cookie2/Cookie.java\
	ChocolateChip2.java\
	Lunch.java

norun=\
	mypackage/MyClass.java\
	dessert/Cookie.java\
	Pie.java\
	cookie2/Cookie.java\
	Lunch.java

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
