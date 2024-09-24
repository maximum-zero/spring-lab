# Spring Lab Project 

## 목차

- [Docker Compose로 PostgreSQL 생성](#docker-compose로-postgresql-생성)
  - [1. /sql/init.sql 수정](#1-sqlinitsql-수정)
  - [2. Docker Compose 실행](#2-docker-compose-실행)
  - [3. application.yml DB 정보 변경](#3-applicationyml-db-정보-변경)

## Docker Compose로 PostgreSQL 생성

PostgreSQL 데이터베이스를 Docker Compose로 설정하는 방법을 설명합니다.

### 1. /sql/init.sql 수정

PostgreSQL의 계정 및 비밀번호를 설정합니다.
```sql
CREATE DATABASE spring_lab;
CREATE USER maximum0 WITH ENCRYPTED PASSWORD 'maximum0';
GRANT ALL PRIVILEGES ON DATABASE spring_lab TO maximum0;
```

### 2. Docker Compose 실행

Docker Compose로 데이터베이스를 실행합니다.

```bash
docker-compose up -d db
```

### 3. application.yml DB 정보 변경

1번에서 설정한 DB 계정에 맞춰 환경변수를 변경합니다.
