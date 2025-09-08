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

<details> <summary><strong>⚠️ 1. Erro de Gradle</strong></summary>

Se você encontrar erros relacionados ao Gradle, tente os seguintes passos:

- Execute "File > Invalidate Caches / Restart" no Android Studio.
- Atualize o Gradle para a versão mais recente, se necessário.

</details>

<details> <summary><strong>🔥 2. Erro de Firebase</strong></summary>

Se houver problemas com a configuração do Firebase:

- Verifique se o arquivo `google-services.json` está nos locais corretos (`app/google-services.json` e `app2/google-services.json`).
- Confirme se as dependências do Firebase estão corretamente declaradas nos arquivos `build.gradle` (tanto do projeto quanto dos módulos `app` e `app2`).

</details>

<details> <summary><strong>🗺️ 3. Erro de Google Maps</strong></summary>

Para resolver problemas com o Google Maps:

- Verifique se a chave da API do Google Maps está correta no arquivo `app2/src/main/AndroidManifest.xml`.
  ```xml
   <meta-data
       android:name="com.google.android.geo.API_KEY"
       android:value="AIzaSyC8Hzn4sIDkYGHFSg0wUwhU2aSSGW34cq4" />
   ```

</details>

:gear: Configuração do Caminho do Android SDK (local.properties)
Se ao abrir o projeto no Android Studio você encontrar erros relacionados ao caminho do SDK, siga os passos abaixo para corrigir o problema:

<details> <summary><strong>:file_folder: 1. Localize o arquivo <code>local.properties</code></strong></summary>
Vá até a raiz do projeto Android, normalmente em:
	ControleDeRiscos/local.properties
</details> <details> <summary><strong>📝 2. Abra o arquivo em um editor de texto</strong></summary>
Você pode usar qualquer editor, como:

Bloco de Notas

VS Code

Sublime Text

Notepad++

</details> <details> <summary><strong>🔍 3. Encontre a linha que começa com <code>sdk.dir=</code></strong></summary>
Exemplo antes da correção:
sdk.dir=C:\\Users\\Tavinho (MEU USUÁRIO)\\AppData\\Local\\Android\\Sdk
</details> <details> <summary><strong>✏️ 4. Corrija o caminho para o seu SDK</strong></summary>
Substitua pelo caminho correto no seu computador

Use barras duplas (\\) como separadores

Exemplo corrigido:
sdk.dir=C:\\Users\\SEU_USUARIO_LOCAL\\AppData\\Local\\Android\\Sdk

</details> <details> <summary><strong>💾 5. Salve o arquivo</strong></summary>
Após alterar, salve o arquivo local.properties

</details> <details> <summary><strong>🔄 6. Sincronize o projeto no Android Studio</strong></summary>
Volte ao Android Studio

Clique em: File > Sync Project with Gradle Files

Ou reinicie o Android Studio, que pode detectar a mudança automaticamente

</details>
✅ Pronto! O caminho do SDK foi configurado corretamente e o projeto deve funcionar sem erros relacionados ao Gradle.


---

## 📌 Contribuição

Sinta-se à vontade para contribuir com o projeto! Para isso:
1. Faça um **fork** do repositório
2. Crie uma **branch** para sua funcionalidade (`feature/nova-funcionalidade`)
3. Envie um **pull request** após testar suas alterações

---

Se tiver dúvidas ou sugestões, entre em contato! 🚀
