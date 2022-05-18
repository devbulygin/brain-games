clean-run: clean-install run-dist

install-build: install build

run-dist:
	./build/install/app/bin/app

clean-install:
	./gradlew clean installDist


install:
	./gradlew clean install


build:
	./gradlew clean init build

.PHONY: build