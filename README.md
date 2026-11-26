# Simple CI/CD Practice Project

Java 17 + Maven + JUnit 5 + GitHub Actions.

## Run locally
    mvn test                 # run tests
    mvn package              # build the jar
    java -jar target/simple-cicd-1.0.0.jar

## Try the pipeline
1. Create a GitHub repo and push this project to the `main` branch.
2. Open the repo's **Actions** tab and watch the pipeline run.
3. Break a test on purpose (e.g. change `a + b` to `a - b`), push, and see the pipeline fail.
4. Fix it, push again, and see it turn green.
