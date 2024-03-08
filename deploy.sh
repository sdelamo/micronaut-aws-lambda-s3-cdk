#!/bin/bash
EXIT_STATUS=0
./gradlew clean
./gradlew shadowJar
cd infra
cdk deploy --require-approval never
cd ..
exit $EXIT_STATUS
