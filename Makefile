clean-run: clean-install run-dist

run-dist:
	./build/install/app/bin/app

clean-install:
	./gradlew clean installDist

build:
	./gradlew clean build

.PHONY: build