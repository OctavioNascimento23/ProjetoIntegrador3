1. **Clone o repositório**
```bash
git clone https://https://github.com/OctavioNascimento23/ProjetoIntegrador3.git
git clone https://github.com/OctavioNascimento23/ProjetoIntegrador3.gitAdd commentMore actions
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
       android:value="AIzaSyB6IZsteY3--0L2Swv99Jx2paR_dbnV5Sk" />
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
