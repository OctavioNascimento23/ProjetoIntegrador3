# Projeto Integrador 3: Sistema de Controle de Riscos no Ambiente de Trabalho

Este projeto acadêmico tem como objetivo desenvolver um sistema completo de monitoramento e gestão de riscos no ambiente de trabalho, aplicando conceitos de desenvolvimento mobile, integração com serviços em nuvem e experiência do usuário estudados durante o semestre. 

O sistema é composto por **dois aplicativos Android** desenvolvidos em **Kotlin** que trabalham em conjunto para melhorar a eficiência da gestão de riscos ocupacionais, permitindo desde o registro em campo até a análise gerencial dos dados coletados.

## Vídeo do grupo
- [**Link Google Drive**](https://drive.google.com/file/d/1bH4Ed9lH3ZNDR01_jDy0it4FZB5XxowY/view?usp=sharing)

## Tecnologias Utilizadas
- **Linguagem**: Kotlin para desenvolvimento Android
- **Backend**: Firebase (Authentication, Firestore, Realtime Database, Storage)
- **Mapas**: Google Maps API e Google Location Services
- **UI/UX**: Material Design Components
- **Gráficos**: MPAndroidChart para visualizações de dados
- **Imagens**: Glide para carregamento e cache de imagens
- **Arquitetura**: MVVM com LiveData e ViewModel

---

## 📱 APP 1 - Registro de Riscos

O primeiro aplicativo é destinado aos **trabalhadores e supervisores de campo**, funcionando como uma ferramenta móvel para identificação e registro de situações de risco em tempo real no ambiente de trabalho.

### 📌 Funcionalidades Principais:
- **Autenticação Segura**: Login com Firebase Authentication
- **Registro Completo de Riscos**: 
  - Captura de fotos dos riscos identificados
  - Geolocalização automática do ponto de risco
  - Descrição detalhada da situação
  - Classificação do nível de severidade
- **Envio Instantâneo**: Comunicação direta com a equipe de gestão
- **Histórico Pessoal**: Visualização dos riscos reportados pelo usuário
- **Interface Intuitiva**: Design responsivo adaptado para uso em campo

**Público-alvo**: Funcionários, supervisores de segurança, equipes de campo

---

## 🖥️ APP 2 - Gerenciamento de Riscos

O segundo aplicativo é voltado para **gestores, coordenadores de segurança e administradores**, oferecendo uma plataforma completa para análise, monitoramento e tomada de decisões baseadas nos dados coletados.

### 📌 Funcionalidades Principais:
- **Dashboard Executivo**: Visão geral dos indicadores de segurança
- **Mapa Interativo de Riscos**: 
  - Visualização geográfica de todos os riscos reportados
  - Filtros por data, tipo e severidade
  - Identificação de áreas críticas
- **Gestão de Alertas**: 
  - Lista de riscos pendentes de análise
  - Sistema de priorização automática
  - Acompanhamento do status de resolução
- **Geração de Relatórios**: 
  - Relatórios detalhados por período
  - Análises estatísticas e gráficos
  - Exportação para diferentes formatos
- **Análise de Tendências**: Identificação de padrões e áreas de maior incidência

**Público-alvo**: Gestores de segurança, coordenadores, administradores

---

## 📂 Estrutura do Projeto

```
ProjetoIntegrador3/
├── app/                           # App 1 - Registro de Riscos
│   ├── src/main/java/            # Código fonte Kotlin
│   │   └── com/example/projetointegrador3/
│   │       ├── MainActivity.kt    # Tela principal
│   │       ├── LoginActivity.kt   # Autenticação
│   │       ├── ViewRisksActivity.kt # Visualização de riscos
│   │       ├── Risk.kt           # Modelo de dados
│   │       └── RiskAdapter.kt    # Adaptador para listas
│   ├── src/main/res/             # Recursos (layouts, imagens, etc)
│   ├── google-services.json      # Configuração Firebase
│   └── build.gradle.kts          # Dependências do módulo
│
├── app2/                          # App 2 - Gerenciamento de Riscos
│   ├── src/main/java/            # Código fonte Kotlin
│   │   └── com/example/projetointegrador3/app2/
│   │       ├── MainActivity.kt         # Tela principal
│   │       ├── DashboardActivity.kt    # Dashboard executivo
│   │       ├── RiskMapActivity.kt      # Mapa de riscos
│   │       ├── RiskListActivity.kt     # Lista de riscos
│   │       ├── ReportGenerationActivity.kt # Geração de relatórios
│   │       └── Risco.kt               # Modelo de dados
│   ├── google-services.json      # Configuração Firebase
│   └── build.gradle.kts          # Dependências do módulo
│
├── Documentação/                  # Documentação do projeto
├── gradle/                        # Gradle Wrapper
├── build.gradle.kts              # Configurações do projeto raiz
├── settings.gradle.kts           # Configurações dos módulos
└── README.md                     # Este arquivo
```

## 🚀 Como Executar o Projeto

### Pré-requisitos
- **Android Studio** (versão 2023.1 ou superior)
- **JDK 11** ou superior
- **Android SDK** (API level 24+)
- **Conta Google** para acessar Firebase Console
- **Conta Google Cloud** para Google Maps API
- **Dispositivo Android** (API 24+) ou emulador configurado

1. **Clone o repositório**
```bash
git clone https://github.com/OctavioNascimento23/ProjetoIntegrador3.git
```

2. **Configuração do Firebase**
   - Acesse o [Firebase Console](https://console.firebase.google.com)
   - Verifique se você tem acesso ao projeto ou solicite permissões ao administrador
   - Os arquivos `google-services.json` já estão configurados nos aplicativos
   - **Serviços habilitados**: Authentication, Firestore, Realtime Database, Storage

3. **Configuração do Google Maps**
   - Obtenha uma chave de API do Google Maps no [Google Cloud Console](https://console.cloud.google.com/)
   - Ative as APIs: Maps SDK for Android e Places API
   - Adicione a chave no arquivo `app2/src/main/AndroidManifest.xml`:
   ```xml
   <meta-data
       android:name="com.google.android.geo.API_KEY"
       android:value="SUA_CHAVE_GOOGLE_MAPS_AQUI" />
   ```
   > ⚠️ **Importante**: Nunca compartilhe sua chave de API publicamente. Mantenha-a segura e configure restrições adequadas no Google Cloud Console.

4. **Configuração do Android Studio**
   - Abra o projeto no Android Studio
   - Aguarde a sincronização automática com os arquivos Gradle
   - Verifique se todas as dependências foram baixadas corretamente
   - Configure um emulador ou conecte um dispositivo físico para testes

### Executando os Aplicativos

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
- Certifique-se de que as APIs necessárias estão habilitadas no Google Cloud Console:
  - Maps SDK for Android
  - Places API
  ```xml
   <meta-data
       android:name="com.google.android.geo.API_KEY"
       android:value="SUA_CHAVE_GOOGLE_MAPS_AQUI" />
   ```
- Verifique as restrições de uso da API key no Google Cloud Console

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

## 🎓 Sobre o Projeto Acadêmico

Este é um **Projeto Integrador** desenvolvido como parte do curso, com o objetivo de aplicar na prática os conhecimentos adquiridos em:

- **Desenvolvimento Mobile**: Criação de aplicativos Android nativos
- **Integração com Serviços em Nuvem**: Uso do Firebase para backend
- **Geolocalização e Mapas**: Implementação de funcionalidades baseadas em localização
- **Experiência do Usuário**: Design de interfaces intuitivas para diferentes perfis de usuário
- **Gestão de Projetos**: Planejamento e execução de um sistema completo

### 📊 Status do Projeto
- ✅ **Concluído**: Desenvolvimento dos dois aplicativos Android
- ✅ **Funcional**: Sistema de autenticação e registro de riscos
- ✅ **Integrado**: Comunicação entre apps via Firebase
- ✅ **Testado**: Validação em dispositivos reais e emuladores

---

## 📌 Contribuição

Sinta-se à vontade para contribuir com o projeto! Para isso:
1. Faça um **fork** do repositório
2. Crie uma **branch** para sua funcionalidade (`feature/nova-funcionalidade`)
3. Envie um **pull request** após testar suas alterações

---

Se tiver dúvidas ou sugestões, entre em contato! 🚀
