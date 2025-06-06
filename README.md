# Projeto Integrador 3: Sistema de Controle de Riscos no Ambiente de Trabalho

Este projeto tem como objetivo desenvolver um sistema de monitoramento de riscos no ambiente de trabalho, aplicando conceitos estudados durante o semestre. O sistema será composto por dois aplicativos que irão melhorar a eficiência da gestão de riscos.

## Tecnologias Utilizadas
- **Kotlin** para o aplicativo móvel de registro de riscos
- **Flutter** para o aplicativo de gerenciamento de riscos

---

## 📱 APP 1 - Registro de Riscos

O primeiro aplicativo será responsável por registrar e reportar riscos no ambiente de trabalho. Ele permitirá que os usuários façam o envio de riscos diretamente para os gestores.

### 📌 Funcionalidades:
- **Autenticação de usuário**
- **Registro de riscos** com anexos (fotos) e geolocalização
- **Envio de alertas** para a equipe de gestão de riscos

**Tecnologia utilizada:** Kotlin

---

## 🖥️ APP 2 - Gerenciamento de Riscos

O segundo aplicativo será utilizado para visualizar e gerenciar os riscos reportados. Ele permitirá uma análise detalhada dos riscos e auxiliará na tomada de decisões.

### 📌 Funcionalidades:
- **Mapa de Riscos**, destacando as principais áreas de risco com base na geolocalização
- **Geração de relatórios** detalhados sobre os riscos identificados

**Tecnologia utilizada:** Flutter

---

## 📂 Estrutura do Projeto

```
ControleDeRiscos/
├── app/                    # App 1 - Registro de Riscos (Kotlin)
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/      # Código fonte Kotlin
│   │   │   ├── res/       # Recursos (layouts, imagens, etc)
│   │   │   └── AndroidManifest.xml
│   │   └── test/          # Testes unitários
│   └── build.gradle       # Configurações do Gradle
│
├── app2/                   # App 2 - Gerenciamento de Riscos (Kotlin)
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/      # Código fonte Kotlin
│   │   │   ├── res/       # Recursos (layouts, imagens, etc)
│   │   │   └── AndroidManifest.xml
│   │   └── test/          # Testes unitários
│   └── build.gradle       # Configurações do Gradle
│
├── gradle/                 # Configurações do Gradle Wrapper
├── build.gradle           # Configurações do projeto
└── settings.gradle        # Configurações dos módulos
```

## 🚀 Como Executar o Projeto

### Pré-requisitos
- Android Studio (versão mais recente)
- JDK 11 ou superior
- Android SDK (API 24 ou superior)
- Google Play Services
- Firebase Account

### Configuração do Ambiente

1. **Clone o repositório**
```bash
git clone https://https://github.com/OctavioNascimento23/ProjetoIntegrador3.git
```

2. **Acesso ao Firebase**
   - Acesse [Firebase Console](https://console.firebase.google.com)
   - Somente com email autenticado para acessar
   - Já configurado nos aplicativos

3. **Configuração do Google Maps**
   - Adicione a chave no arquivo `app2/src/main/AndroidManifest.xml`:
   ```xml
   <meta-data
       android:name="com.google.android.geo.API_KEY"
       android:value="AIzaSyB6IZsteY3--0L2Swv99Jx2paR_dbnV5Sk" />
   ```

4. **Configuração do Android Studio**
   - Abra o projeto no Android Studio
   - Sincronize o projeto com os arquivos Gradle
   - Aguarde a conclusão do download das dependências

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

1. **Erro de Gradle**
   - Execute "File > Invalidate Caches / Restart"
   - Atualize o Gradle para a versão mais recente

2. **Erro de Firebase**
   - Verifique se o arquivo `google-services.json` está no local correto
   - Confirme se as dependências do Firebase estão corretas no `build.gradle`

3. **Erro de Google Maps**
   - Verifique se a chave da API está correta
   - Confirme se a API está habilitada no Console do Google Cloud

---

## 📌 Contribuição

Sinta-se à vontade para contribuir com o projeto! Para isso:
1. Faça um **fork** do repositório
2. Crie uma **branch** para sua funcionalidade (`feature/nova-funcionalidade`)
3. Envie um **pull request** após testar suas alterações

---

Se tiver dúvidas ou sugestões, entre em contato! 🚀
