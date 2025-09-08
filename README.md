# Projeto Integrador 3: Sistema de Controle de Riscos no Ambiente de Trabalho

Este projeto tem como objetivo desenvolver um sistema de monitoramento de riscos no ambiente de trabalho, aplicando conceitos estudados durante o semestre. O sistema será composto por dois aplicativos que irão melhorar a eficiência da gestão de riscos.

## Vídeo do grupo
- [**Link Google Drive**](https://drive.google.com/file/d/1bH4Ed9lH3ZNDR01_jDy0it4FZB5XxowY/view?usp=sharing)

## Tecnologias Utilizadas
- **Kotlin** para desenvolvimento dos aplicativos móveis
- **Android Gradle Plugin 8.9.1** com Kotlin DSL
- **Firebase BOM 33.12.0** para serviços backend:
  - Firebase Authentication para autenticação de usuários
  - Firebase Firestore para banco de dados NoSQL
  - Firebase Storage para armazenamento de arquivos
- **Google Maps API** para visualização geográfica dos riscos
- **Google Play Services** para serviços de localização
- **Material Design 3** para interface moderna
- **ViewBinding e DataBinding** para ligação de views
- **Glide** para carregamento de imagens
- **MPAndroidChart** para gráficos e relatórios

---

## 📱 APP 1 - Registro de Riscos

O primeiro aplicativo será responsável por registrar e reportar riscos no ambiente de trabalho. Ele permitirá que os usuários façam o envio de riscos diretamente para os gestores.

### 📌 Funcionalidades:
- **Autenticação de usuário** com Firebase Authentication
- **Registro de riscos** com anexos (fotos) e geolocalização
- **Envio de alertas** para a equipe de gestão de riscos
- **Visualização de riscos** registrados pelo usuário
- **Interface responsiva** com Material Design
- **Armazenamento offline** para sincronização posterior

**Tecnologia utilizada:** Kotlin

---

## 🖥️ APP 2 - Gerenciamento de Riscos

O segundo aplicativo será utilizado para visualizar e gerenciar os riscos reportados. Ele permitirá uma análise detalhada dos riscos e auxiliará na tomada de decisões.

### 📌 Funcionalidades:
- **Dashboard principal** com visão geral dos riscos
- **Mapa de Riscos**, destacando as principais áreas de risco com base na geolocalização
- **Geração de relatórios** detalhados sobre os riscos identificados
- **Lista de riscos** com filtros e pesquisa avançada
- **Alertas recentes** para monitoramento em tempo real
- **Análise de dados** com gráficos e estatísticas
- **Interface responsiva** otimizada para gestores

**Tecnologia utilizada:** Kotlin

---

## 📂 Estrutura do Projeto

```
ProjetoIntegrador3/
├── app/                        # App 1 - Registro de Riscos (Kotlin)
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/           # Código fonte Kotlin
│   │   │   │   └── com/example/projetointegrador3/
│   │   │   │       ├── LoginActivity.kt
│   │   │   │       ├── MainActivity.kt
│   │   │   │       ├── Risk.kt
│   │   │   │       ├── RiskAdapter.kt
│   │   │   │       └── ViewRisksActivity.kt
│   │   │   ├── res/            # Recursos (layouts, imagens, etc)
│   │   │   └── AndroidManifest.xml
│   │   ├── androidTest/        # Testes instrumentados
│   │   └── test/               # Testes unitários
│   ├── build.gradle.kts        # Configurações do Gradle (Kotlin DSL)
│   └── google-services.json    # Configuração do Firebase
│
├── app2/                       # App 2 - Gerenciamento de Riscos (Kotlin)
│   ├── src/
│   │   └── main/
│   │       ├── java/           # Código fonte Kotlin
│   │       │   └── com/example/projetointegrador3/app2/
│   │       │       ├── DashboardActivity.kt
│   │       │       ├── MainActivity.kt
│   │       │       ├── RecentAlertsAdapter.kt
│   │       │       ├── ReportGenerationActivity.kt
│   │       │       ├── Risco.kt
│   │       │       ├── RiskAdapter.kt
│   │       │       ├── RiskListActivity.kt
│   │       │       └── RiskMapActivity.kt
│   │       ├── res/            # Recursos (layouts, imagens, etc)
│   │       └── AndroidManifest.xml
│   ├── build.gradle.kts        # Configurações do Gradle (Kotlin DSL)
│   └── google-services.json    # Configuração do Firebase
│
├── Documentação/               # Documentação do projeto
├── Video Final/                # Vídeos demonstrativos
├── gradle/                     # Configurações do Gradle Wrapper
│   ├── wrapper/
│   └── libs.versions.toml     # Catálogo de versões das dependências
├── build.gradle.kts           # Configurações do projeto principal
└── settings.gradle.kts        # Configurações dos módulos
```

## 🚀 Como Executar o Projeto

### Pré-requisitos
- **Android Studio** (versão 2023.3.1 ou superior)
- **JDK 11** ou superior
- **Android SDK API 24** (mínimo) até **API 36** (target)
- **Google Play Services** instalado no dispositivo/emulador
- **Firebase Account** com permissões de acesso ao projeto
- **Conexão com internet** para sincronização com Firebase

1. **Clone o repositório**
```bash
git clone https://github.com/OctavioNascimento23/ProjetoIntegrador3.git
```

2. **Acesso ao Firebase**
   - Acesse [Firebase Console](https://console.firebase.google.com)
   - Somente com email autenticado para acessar
   - Projeto já configurado nos aplicativos com arquivos `google-services.json`
   - **Serviços configurados:**
     - Authentication (autenticação de usuários)
     - Firestore Database (banco de dados)
     - Storage (armazenamento de arquivos)
     - Analytics (análise de uso)

3. **Configuração do Google Maps**
   - Adicione a chave no arquivo `app2/src/main/AndroidManifest.xml`:
   ```xml
   <meta-data
       android:name="com.google.android.geo.API_KEY"
       android:value="AIzaSyC8Hzn4sIDkYGHFSg0wUwhU2aSSGW34cq4" />
   ```

4. **Configuração do Android Studio**
   - Abra o projeto no Android Studio
   - O projeto utiliza **Gradle Kotlin DSL** (build.gradle.kts)
   - Aguarde a sincronização automática do projeto com os arquivos Gradle
   - Verifique se todas as dependências foram baixadas corretamente
   - **Versões importantes:**
     - Android Gradle Plugin: 8.9.1
     - Kotlin: 2.0.21
     - Compile SDK: 35 (app1) / 36 (app2)
     - Target SDK: 35 (app1) / 36 (app2)
     - Min SDK: 24

### Executando os Aplicativos

> **📋 Nota:** O projeto utiliza um **catálogo de versões** (gradle/libs.versions.toml) para gerenciar as dependências de forma centralizada, garantindo consistência entre os módulos.

#### App 1 (Registro de Riscos)
1. Abra o projeto no Android Studio
2. Selecione o módulo `app` no seletor de configuração
3. Conecte um dispositivo Android ou inicie um emulador
4. Clique em "Run" (▶️) ou pressione Shift + F10

#### App 2 (Gerenciamento de Riscos)
1. No mesmo projeto, selecione o módulo `app2`
2. Clique em "Run" (▶️) ou pressione Shift + F10

### Solução de Problemas Comuns

<details> <summary><strong>⚠️ 1. Erro de Gradle/Sincronização</strong></summary>

Se você encontrar erros relacionados ao Gradle ou problemas de sincronização:

- Execute "File > Invalidate Caches / Restart" no Android Studio
- Verifique se o JDK 11+ está configurado corretamente
- Execute `./gradlew clean` no terminal para limpar o projeto
- Confirme se todas as dependências do `libs.versions.toml` estão atualizadas
- **Versão do Gradle:** 8.9.1 (definida no Android Gradle Plugin)
- **Kotlin:** 2.0.21

</details>

<details> <summary><strong>🔥 2. Erro de Firebase</strong></summary>

Se houver problemas com a configuração do Firebase:

- Verifique se o arquivo `google-services.json` está nos locais corretos:
  - `app/google-services.json`
  - `app2/google-services.json`
- Confirme se as dependências do Firebase estão corretamente declaradas nos arquivos `build.gradle.kts`
- **Firebase BOM atual:** 33.12.0
- Verifique se você tem permissões de acesso ao projeto no Firebase Console
- Confirme se os serviços estão habilitados: Authentication, Firestore, Storage

</details>

<details> <summary><strong>🗺️ 3. Erro de Google Maps</strong></summary>

Para resolver problemas com o Google Maps no App 2:

- Verifique se a chave da API do Google Maps está correta no arquivo `app2/src/main/AndroidManifest.xml`
- **Chave atual configurada:** `AIzaSyC8Hzn4sIDkYGHFSg0wUwhU2aSSGW34cq4`
- Confirme se a Google Maps API está habilitada no Google Console
- Verifique se o Google Play Services está instalado no dispositivo/emulador

</details>

<details> <summary><strong>📱 4. Erro de Compatibilidade SDK</strong></summary>

Para problemas relacionados à versão do SDK:

- **Min SDK:** 24 (Android 7.0)
- **Target SDK:** 35 (app) / 36 (app2)
- **Compile SDK:** 35 (app) / 36 (app2)
- Atualize o Android SDK para as versões mais recentes
- Confirme se o emulador tem a versão mínima do Android

</details>

<details> <summary><strong>⚙️ 5. Configuração do Caminho do Android SDK (local.properties)</strong></summary>

Se ao abrir o projeto no Android Studio você encontrar erros relacionados ao caminho do SDK:

1. **Localize o arquivo `local.properties`** na raiz do projeto
2. **Abra o arquivo** em um editor de texto
3. **Encontre a linha** que começa com `sdk.dir=`
4. **Corrija o caminho** para o seu SDK local:
   ```properties
   sdk.dir=C:\\Users\\SEU_USUARIO\\AppData\\Local\\Android\\Sdk
   ```
   - Use barras duplas (\\) no Windows
   - Use barras simples (/) no macOS/Linux
5. **Salve o arquivo** e sincronize o projeto no Android Studio

**Exemplo para diferentes sistemas:**
- **Windows:** `sdk.dir=C:\\Users\\Usuario\\AppData\\Local\\Android\\Sdk`
- **macOS:** `sdk.dir=/Users/usuario/Library/Android/sdk`
- **Linux:** `sdk.dir=/home/usuario/Android/Sdk`

</details>


---

## 🆕 Novidades e Melhorias

### Versão 1.0 (Atual)
- **✅ Arquitetura moderna:** Migração para Gradle Kotlin DSL para melhor manutenibilidade
- **✅ Gestão centralizada de dependências:** Implementação do catálogo de versões (libs.versions.toml)
- **✅ Firebase BOM 33.12.0:** Atualização para a versão mais recente do Firebase
- **✅ Kotlin 2.0.21:** Suporte às mais recentes funcionalidades da linguagem
- **✅ Material Design 3:** Interface moderna e responsiva
- **✅ ViewBinding/DataBinding:** Melhor performance e segurança de tipos
- **✅ Múltiplas atividades:** Sistema completo de navegação entre telas
- **✅ Suporte offline:** Sincronização automática quando conectado
- **✅ Relatórios visuais:** Integração com MPAndroidChart para gráficos
- **✅ Dashboard avançado:** Visão completa dos riscos e alertas

### Próximas Melhorias Planejadas
- 🔄 Notificações push em tempo real
- 🔄 Sincronização em tempo real entre apps
- 🔄 Relatórios em PDF
- 🔄 Backup automático na nuvem

---

## 🧪 Testes e Qualidade

### Estrutura de Testes
- **Testes unitários:** Localizados em `app/src/test/` e `app2/src/test/`
- **Testes instrumentados:** Localizados em `app/src/androidTest/`
- **Framework de teste:** JUnit 4.13.2 e Espresso 3.6.1

### Executando Testes
```bash
# Testes unitários
./gradlew test

# Testes instrumentados (requer dispositivo/emulador conectado)
./gradlew connectedAndroidTest
```

### Lint e Verificação de Código
```bash
# Executar lint
./gradlew lint

# Verificar código
./gradlew check
```

---

## ⚡ Dicas de Performance

### Para melhor performance dos aplicativos:
- **Emulador:** Use um emulador com pelo menos 2GB de RAM
- **Dispositivo físico:** Android 7.0+ para melhor compatibilidade
- **Internet:** Conexão estável para sincronização com Firebase
- **Armazenamento:** Pelo menos 1GB livre para cache e dados

### Otimizações implementadas:
- ViewBinding para melhor performance de UI
- Firebase offline persistence habilitado
- Carregamento assíncrono de imagens com Glide
- Reutilização de views com RecyclerView

---

## 📚 Documentação Adicional

### Arquivos de Documentação
- **📁 Documentação/**: Contém documentação técnica completa do projeto
- **📁 Video Final/**: Vídeos demonstrativos e instruções
- **📋 README.md**: Este arquivo - guia principal do projeto

### Recursos Úteis
- [**Documentação do Firebase**](https://firebase.google.com/docs)
- [**Guia do Android Kotlin**](https://developer.android.com/kotlin)
- [**Google Maps Platform**](https://developers.google.com/maps/documentation)
- [**Material Design Guidelines**](https://material.io/design)

### Versões e Changelog
- **v1.0** (Atual): Versão estável com todas as funcionalidades principais
- Consulte os commits do Git para histórico detalhado de mudanças

---

## 📌 Contribuição

Sinta-se à vontade para contribuir com o projeto! Para isso:
1. Faça um **fork** do repositório
2. Crie uma **branch** para sua funcionalidade (`feature/nova-funcionalidade`)
3. Teste suas alterações localmente
4. Envie um **pull request** com descrição detalhada das mudanças

### Diretrizes de Contribuição
- Mantenha o código organizado e comentado
- Siga as convenções de nomenclatura Kotlin
- Adicione testes para novas funcionalidades
- Atualize a documentação quando necessário

---

## 📞 Suporte e Contato

Para dúvidas, sugestões ou problemas:
- **📧 Issues**: Abra uma issue no GitHub para bugs ou melhorias
- **💬 Discussões**: Use as discussões do repositório para perguntas gerais
- **📱 Demo**: Assista ao vídeo demonstrativo na pasta "Video Final"

---

**🚀 Desenvolvido com ❤️ para melhorar a segurança no ambiente de trabalho**
