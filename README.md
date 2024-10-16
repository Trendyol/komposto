# Design Android

## Getting Started

### Add Dependencies

Add the following dependencies to your project's `build.gradle` file:

```kotlin
implementation("com.trendyol:design-core:LATEST_VERSION")
implementation("com.trendyol:design-theme:LATEST_VERSION")
implementation("com.trendyol:bottom-sheet:LATEST_VERSION")
```

This artifacts are published in the [internal nexus repository](http://10.84.105.74/).
To download the artifacts, you need to add the following repository to
your project's `buildscript` or `dependencyResolutionManagement` block:

```kotlin
repositories {
    maven {
        url = uri("http://10.84.105.74/repository/maven-releases")
        isAllowInsecureProtocol = true
        // This part is optional but it's always a good idea to filter the dependencies to look for
        content { 
            includeGroupByRegex("com.trendyol.*")
        }
    }
}
```

### Contributing

We welcome contributions in the form of feedback, bug reports, or pull requests.
Before proposing a change, please discuss your change by raising an issue.
Please make sure to read the [Contributing Guide](CONTRIBUTING.md) before making a pull request.


# UI-Kit Screenshot Rule Sets

Yeni bir component'in screenshot testini yazacak kişilere rehberlik eden bir rule set oluşturmak için aşağıdaki maddeleri dikkate alabiliriz. Bu set, adım adım bir rehber ve yönerge niteliği taşıyacak, böylece yeni başlayanlar bile component screenshot testlerini doğru ve tutarlı şekilde yazabilecekler.
Android Screenshot Test Rule Set:
### 1. Test Adı Standartlarına Uyun
**Test ismi anlamlı olmalı:** Screenshot testinizin amacı ve component’i hakkında bilgi verecek anlamlı bir isim seçin.
**Önerilen İsim Yapısı:** ```{ComponentAdı}_{Özellik}_{Durum}```
Örnek: ```Button_Disabled_LargeSize``` veya ```Toolbar_WithIcons```
### 2. Component Stillerini Kapsayın
Farklı stillerde component’leri test edin. Her stil için ayrı bir test case oluşturun.
Örnek: Bir toolbar’ı ```EndIcon, TextButton, None``` gibi farklı stillerde test edin.
### 3. Component Boyutlarına Dikkat Edin
Eğer component'in farklı boyut seçenekleri varsa (örneğin küçük, orta, büyük buton), bu boyutların hepsi için ayrı bir screenshot testi yazın.
Boyutlar önemlidir çünkü UI tutarlılığı ve ekranda kapladığı alanı doğrulamak açısından kritiktir.
Örnek: ```Button_SmallSize, Button_LargeSize```.
### 4. Component Durumlarını Test Edin
Component’in etkileşimde olabileceği her durumu test edin (aktif, pasif, hata durumu vb.).
Örnek: Bir butonun ```Enabled, Disabled, Loading``` gibi durumlarını test edin.
Durumları test ederken, her bir durumu düzgün temsil ettiğinden emin olun.
### 5. Test Case Tasarımına Dikkat Edin
Her test case basit ve bağımsız olmalı. Farklı senaryoları karıştırmamaya dikkat edin.
Tek bir test içinde birden fazla senaryo denemek yerine, her senaryoyu ayrı bir test olarak yazın. Bu, testlerin daha temiz ve hataların daha kolay izlenebilir olmasını sağlar.
### 6. Ekran Boyutları ve DPI Kapsamını Göz Ardı Etmeyin
Farklı cihaz boyutları ve DPI seçenekleri için component'in nasıl göründüğünü doğrulamak için ekran çözünürlüğü farklı olan cihazlarda test yapın.
Bu testler responsive UI için özellikle önemlidir.
### 7. Component’e Özel Parametreleri Test Edin
Component’lerin farklı parametreler ile nasıl görüneceğini test edin. Örneğin, bir button için farklı ```text, icon``` veya ```backgroundColor``` kombinasyonlarını test edebilirsiniz.
Örnek: ```Button_WithIcon, Button_WithTextOnly```.
### 8. Test Sonucu Olarak Ekran Görüntüsü Alın
Testlerinizde her component için ekran görüntüsü almayı unutmayın. Alınan ekran görüntüsünün doğru ve tam olarak render edildiğinden emin olun.
Test sonunda ekran görüntüsü alıp, sonucu belirttiğiniz klasöre kaydedin.
### 9. Bağlantısız (Stateless) Testler Yazın
Testlerin her biri bağımsız olmalı ve diğer testlere veya global duruma bağımlı olmamalı. Her test kendi başına çalışabilmeli.
Global bir state’e dayanan testler, hata ayıklamayı zorlaştırır.
### 10. Kod Tekrarından Kaçının
Aynı component’in farklı durumları için yeniden kullanılabilir fonksiyonlar oluşturun. Böylece tekrar eden kodlar yazmaktan kaçınabilirsiniz.
Örnek: Farklı stillerle toolbar testi için tek bir ```runToolbarScreenshotTest``` fonksiyonu kullanmak.
### 11. Test Sonuçlarını Doğrulayın (Assertion)
Eğer mümkünse, alınan screenshot’ların beklentilerle uyuşup uyuşmadığını doğrulamak için assertion kullanın. Ancak bu manuel gözle kontrol anlamına da gelebilir, özellikle UI değişiklikleri sırasında.
Rule Set'in Kapsamı Örnek Test Kodu:
kotlin

```
@Test
fun buttonStatesTest() {
    runScreenShotTest(
        testName = "Button_Disabled_SmallSize",
        contents = listOf(
            DesignScreenshotTestContainer("DisabledSmall") {
                Button(
                    text = "Disabled",
                    enabled = false,
                    size = ButtonSize.Small,
                    onClick = { }
                )
            },
            DesignScreenshotTestContainer("EnabledMedium") {
                Button(
                    text = "Enabled",
                    enabled = true,
                    size = ButtonSize.Medium,
                    onClick = { }
                )
            }
        )
    )
}
```

Bu rule set, component’ler için screenshot testleri yazarken dikkat edilmesi gereken temel noktaları kapsar ve test yazan kişilere rehberlik eder.

*Gradle Commands:*
- **Recording/Updating screenshots:** ./gradlew executeScreenshotTests -Precord
- **Screentshot Test Excetution:** ./gradlew executeScreenshotTests