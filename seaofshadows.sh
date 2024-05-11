#!/usr/bin/env bash

./gradlew :seaofshadows:jvmJar > /dev/null

VERSION=$(cat gradle.properties | grep "^VERSION" | awk -F "=" '{print $2}')


java -jar cli/output/seaofshadows-jvm-$VERSION.jar $@